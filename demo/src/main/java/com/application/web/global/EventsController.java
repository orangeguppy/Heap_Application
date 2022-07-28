package com.application.web.global;

import com.application.database.global.entity.EventRegistration;
import com.application.database.global.entity.Events;

import com.application.database.global.repository.EventRegistrationRepository;
import com.application.database.global.repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventsController {
    @Autowired
    EventsRepository eventsRepository;

    @Autowired
    EventRegistrationRepository eventRegRepo;

    @GetMapping
    List<Events> getAllEvents() {
        return eventsRepository.findAll();
    }

    @GetMapping("/get-event-by-eid/{id}")
    Events getEventById(@PathVariable int id) {
        return eventsRepository.findByEID(id);
    }

    @GetMapping("/{input}")
    List<Events> getEventsWithNameLike(@PathVariable String input) {
        return eventsRepository.findByEventNameContaining(input);
    }

    @GetMapping("/registered-by-user/{uid}/")
    List<Events> getEventsRegisteredByUser(@PathVariable int uid) {
        List<Events> ret = new ArrayList<Events>(); // return this
        // This is a list of all event registrations where uid = uid
        List<EventRegistration> eventRegList = eventRegRepo.findByUID(uid);

            for (EventRegistration e : eventRegList) {
                Events event = eventsRepository.findByEID(e.getEID());
                ret.add(event);
            }
            return ret;
    }
    @GetMapping("/registered-by-user/{uid}/{eventQuery}")
    List<Events> getEventsRegisteredByUser(@PathVariable int uid, @PathVariable String eventQuery) {
        List<Events> ret = new ArrayList<Events>(); // return this
        // This is a list of all event registrations where uid = uid
        List<EventRegistration> eventRegList = eventRegRepo.findByUID(uid);

        for (EventRegistration e : eventRegList) {
            Events event = eventsRepository.findByEID(e.getEID());
            if (event != null) {
                if (event.getEventName().toLowerCase().contains(eventQuery.toLowerCase())) {
                    ret.add(event);
                }
            }
        }
        return ret;
    }

    @GetMapping("/managed-by/{oid}/")
    List<Events> getEventsManagedByUser(@PathVariable int oid) {
        return eventsRepository.findByOID(oid);
    }

    @GetMapping("/managed-by/{oid}/{eventName}")
    List<Events> queryEventsManagedByUser(@PathVariable int oid, @PathVariable String eventName) {
        return eventsRepository.findByOIDAndEventNameContaining(oid, eventName);
    }
}
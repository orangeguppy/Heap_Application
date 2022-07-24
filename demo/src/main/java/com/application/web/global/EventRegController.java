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

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/event-registration")
public class EventRegController {
    @Autowired
    EventRegistrationRepository eventRegRepo;

    // When the submit button is clicked:
    /*
        1. Check if the event registration exists
        2. If it does not exist, create a new registration entity and save it
        3. If it does exist, exit the application and tell the user that they've already registered for the event
     */
    @GetMapping("/{eid}/{uid}/{role}")
    String submitRegistration(@PathVariable int eid, @PathVariable int uid, @PathVariable String role) {
        if (eventRegRepo.findByEIDAndUID(eid, uid).isPresent()) {
            return "You've already registered for this event!";
        } else {
            EventRegistration entry = new EventRegistration(uid, eid, role);
            eventRegRepo.save(entry);
            return "Registration successful!";
        }
    }

    @GetMapping("/{uid}/{eventName}")
    List<EventRegistration> findEventsUserRegisteredFor(@PathVariable int uid, @PathVariable String eventName) {
        return eventRegRepo.findByUIDAndEventNameContaining(uid, eventName);
    }
}
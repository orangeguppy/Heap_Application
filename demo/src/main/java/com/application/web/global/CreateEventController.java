package com.application.web.global;

import com.application.database.global.entity.EventRegistration;
import com.application.database.global.entity.Events;
import com.application.database.global.repository.EventRegistrationRepository;
import com.application.database.global.repository.EventsRepository;
import com.application.database.global.entity.Events;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/create-event")
public class CreateEventController {
    @Autowired
    EventsRepository eventsRepo;
    @GetMapping("/{eventName}/{maxCapacity}/{eventLocation}/{minAge}/{roles}")
    String submitCreatedEvent(@PathVariable String eventName, @PathVariable int maxCapacity,
                              @PathVariable String eventLocation, @PathVariable int minAge,
                              @PathVariable String roles) {

        Events entry = new Events(eventName, maxCapacity, eventLocation, minAge, roles);
        eventsRepo.save(entry);
        return "Event created successfully!";
    }
}

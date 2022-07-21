package com.application.web.global;

import com.application.database.global.entity.Events;

import com.application.database.global.repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventsController {
    @Autowired
    EventsRepository eventsRepository;

    @GetMapping
    List<Events> getAllEvents() {
        return eventsRepository.findAll();
    }

    @GetMapping("/get-one/{id}")
    Optional<Events> getEventById(@PathVariable int id) {
        return eventsRepository.findByEID(id);
    }

    @GetMapping("/get-one-by-name/{eventName}")
    Optional<Events> getByEventName(@PathVariable String eventName) {
        return eventsRepository.findByEventName(eventName);
    }

    @GetMapping("/{input}")
    List<Events> getEventsWithNameLike(@PathVariable String input) {
        return eventsRepository.findByEventNameContaining(input);
    }
}
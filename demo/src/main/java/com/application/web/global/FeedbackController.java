package com.application.web.global;

import com.application.database.global.entity.Feedback;
import com.application.database.global.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    FeedbackRepository feedbackRepo;

    @GetMapping("/{name}/{email}/{message}")
    public void submitFeedback(@PathVariable String name, @PathVariable String email, @PathVariable String message) {
        Feedback feedback = new Feedback(name, email, message);
        feedbackRepo.save(feedback);
    }
}
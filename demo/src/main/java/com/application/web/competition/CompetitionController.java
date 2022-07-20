package com.application.web.competition;

import com.application.database.competition.repository.CompetitionRepository;
import com.application.database.competition.entity.Competition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/competitions")
public class CompetitionController {
    @Autowired
    CompetitionRepository competitionRepository;


}
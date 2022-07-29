package com.application;

import com.application.database.competition.repository.CompetitionRepository;
import com.application.database.competition.repository.CompetitorRepository;
import com.application.database.global.repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.application.database.global.repository.UserRepository;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	UserRepository userRepository;

	@Autowired
	CompetitorRepository competitorRepository;

	@Autowired
	CompetitionRepository competitionRepository;

	@Autowired
	EventsRepository eventsRepository;

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	}
}
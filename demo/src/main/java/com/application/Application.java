package com.application;

import com.application.database.competition.entity.Competition;
import com.application.database.competition.entity.Competitor;
import com.application.database.competition.repository.CompetitionRepository;
import com.application.database.competition.repository.CompetitorRepository;
import com.application.database.global.entity.Events;
import com.application.database.global.repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.application.database.global.entity.User;
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
		// Insert data into the table
//		User user = new User("Mary", "Pete", "mary", "pw", ZonedDateTime.of(2010, 6, 30, 1, 45, 59, 1234, ZoneId.of("Etc/UTC")),
//				"mudkip@gmail.com", 87654321);
//
//		// repo.save method
//		userRepository.save(user);
//
//		// Create new competitor
//		Competitor comp = new Competitor(5);
//		competitorRepository.save(comp);

		// System.out.println("Users who registered today (LITERALLY today)");
		// System.out.println(userRepository.findByDateRegistered(LocalDate.of(2022, Month.JUNE, 20)));

		//Create new competition
//		addNewCompetition("DANCE", 149, "SMU", 10, LocalDate.of(2019, Month.JANUARY, 3),
//				LocalDate.of(2019, Month.JANUARY, 3), LocalDate.of(2019, Month.JANUARY, 3), LocalDate.of(2019, Month.JANUARY, 3));

	}
//	public void addNewCompetition(String eventName, int maxCapacity, String eventLocation, int minAge, LocalDate registrationStart, LocalDate registrationEnd, LocalDate startDateTime, LocalDate endDateTime) {
//		Events event = new Events(eventName, maxCapacity, eventLocation,minAge, registrationStart, registrationEnd, startDateTime, endDateTime,
//				"https://st2.depositphotos.com/3944627/8210/i/600/depositphotos_82105954-stock-photo-abstract-blurred-event-with-people.jpg");
//		eventsRepository.save(event);
//		competitionRepository.save(new Competition(event.getEID()));
//	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//		};
//	}
}
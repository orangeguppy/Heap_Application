package com.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.application.database.entity.User;
import com.application.database.repository.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	UserRepository ob;
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		System.out.println("Hello");
	}
	@Override
	public void run(String... args) throws Exception {
		// Insert data into the table
		User user = new User("Mary", "Pete", ZonedDateTime.of(2022, 6, 30, 1, 45, 59, 1234, ZoneId.of("Etc/UTC")),
				"mudkip@gmail.com", 87654321);

		// repo.save method
		ob.save(user);

		System.out.println("Users who registered today (LITERALLY today)");
		System.out.println(ob.findByDateRegistered(LocalDate.of(2022, Month.JUNE, 19)));
	}

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
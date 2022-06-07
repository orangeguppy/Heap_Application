package com.application.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.application.database.entity.User;
import com.application.database.repository.UserRepository;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	UserRepository ob;
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		ctx.close();
	}
	@Override
	public void run(String... args) throws Exception {
		// Insert data into the table
		User user = new User("Sam", "Lim", ZonedDateTime.of(2016, 11, 30, 12, 45, 59, 1234, ZoneId.of("Etc/UTC")),
				"mudkip@gmail.com", 87654321);

		// repo.save method
		ob.save(user);

		System.out.println(ob.findByDateRegistered(LocalDate.of(2022, Month.JUNE, 7)));
	}
}
package com.application.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.application.database.entity.User;
import com.application.database.dao.UserRepository;
import org.springframework.context.ConfigurableApplicationContext;
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
		User user = new User(8, "Hello", "pokemon", "mudkip@gmail.com", 12345678);

		// repo.save method
		ob.save(user);
		System.out.println("Hello World");

		// Print all entities
		System.out.println(ob.getAllUsers());
	}
}
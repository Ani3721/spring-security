package com.learn;

import com.learn.models.User;
import com.learn.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringBootSecurityLearnApplication implements CommandLineRunner
{
	@Autowired
	UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootSecurityLearnApplication.class, args);
		System.out.println("Spring Security 1");
	}



	@Override
	public void run(String... args) throws Exception
	{

//		User user1 = new User("John", bCryptPasswordEncoder.encode("durgesh"),
//				 "ABC@gmail.com", "NORMAL");
//		 this.userRepository.save(user1);
//		User user2 = new User("roshni", bCryptPasswordEncoder.encode("durgesh"), "roshni@gmail.com", "ADMIN");
//		this.userRepository.save(user2);

		User user = new User();
		user.setEmail("roshni@gmail.com");
		user.setUserName("roshni");
		user.setPassword(bCryptPasswordEncoder.encode("durgesh"));
		userRepository.save(user);
	}



}

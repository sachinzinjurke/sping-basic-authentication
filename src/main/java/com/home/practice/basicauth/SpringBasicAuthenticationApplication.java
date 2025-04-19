package com.home.practice.basicauth;

import com.home.practice.basicauth.pojo.Contact;
import com.home.practice.basicauth.repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class SpringBasicAuthenticationApplication implements CommandLineRunner {

	ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicAuthenticationApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void run(String... args) throws Exception {
		contactRepository.getContacts().add(new Contact("1", "Jon Snow", "6123456432"));
		contactRepository.getContacts().add(new Contact("2", "Tyrion Lannister", "3125466472"));
		contactRepository.getContacts().add(new Contact("3", "The Hound", "5126476532"));		
	}

}

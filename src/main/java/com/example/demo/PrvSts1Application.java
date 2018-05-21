package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrvSts1Application implements CommandLineRunner{
	
	@Autowired
	PersonRepo tabelata;

	public static void main(String[] args) {
		SpringApplication.run(PrvSts1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Zdravo");
		Person milosh = new Person("milosh" , "manojlovic",15);
		Person tate = new Person ("tate" , "mircheski" , 60 );
		tabelata.save(milosh);
		tabelata.save(tate);
	}

	
	
}

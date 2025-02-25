package com.company1.project1.t1053;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Time1053Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Time1053Application.class, args);
		System.out.println("hhello1129");
	}
	@Override
	public void run(String... args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine(); // Read user input
		System.out.println("Hello, " + name + "! Welcome to Spring Boot."); // Print greeting
		scanner.close(); // Close scanner
	}

}

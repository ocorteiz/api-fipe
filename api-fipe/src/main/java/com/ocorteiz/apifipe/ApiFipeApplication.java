package com.ocorteiz.apifipe;

import com.ocorteiz.apifipe.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiFipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiFipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.exibeMenu();
	}
}

package com.example.crud;

import org.springframework.boot.SpringApplication;

public class TestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(CrudApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

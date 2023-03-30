package com.kosuri.stores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.kosuri.stores.*")
@ComponentScan(basePackages = { "com.kosuri.stores.*" })
@EntityScan("com.kosuri.stores.*")
public class StoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoresApplication.class, args);
		System.out.println("Hello World");
		System.out.println("Checking if push to git works");
	}
}

package com.example.HomeWork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HomeWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeWorkApplication.class, args);
	}

		@GetMapping("Meal")
		public String mealView(){
			return "Hello Meal";
		}

		@GetMapping("Order")
		public String orderView(){
			return "Hello Order";
		}


}

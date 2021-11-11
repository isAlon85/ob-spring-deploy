package com.example.obspringex456;

import com.example.obspringex456.entities.Laptop;
import com.example.obspringex456.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringEx456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObSpringEx456Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "Lenovo", "G50", "Black", 14D);
		Laptop laptop2 = new Laptop(null, "Lenovo", "G70", "Black", 15D);
		repository.save(laptop1);
		repository.save(laptop2);
		System.out.println("El número de laptops en repositorio es: " + repository.findAll().size());

	}

}

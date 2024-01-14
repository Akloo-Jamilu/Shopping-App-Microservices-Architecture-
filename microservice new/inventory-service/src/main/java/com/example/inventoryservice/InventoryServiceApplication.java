package com.example.inventoryservice;

import com.example.inventoryservice.model.Inventory;
import com.example.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("samsung_A12");
			inventory.setQuantity(50);

			Inventory inventory3 = new Inventory();
			inventory.setSkuCode("samsung_A12");
			inventory.setQuantity(50);

			Inventory inventory2 = new Inventory();
			inventory.setSkuCode("samsung_A12");
			inventory.setQuantity(50);

			Inventory inventory1 = new Inventory();
			inventory.setSkuCode("samsung_A13");
			inventory.setQuantity(0);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
			inventoryRepository.save(inventory2);

//			inventoryRepository.save(inventory);
//			inventoryRepository.save(inventory1);
//			inventoryRepository.save(inventory2);
		};
	}
}

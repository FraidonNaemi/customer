package com.khancode;

import com.khancode.customer.Customer;
import com.khancode.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository) {
        return args -> {
            Customer alex = new Customer ("Alex", "alex@gmail.com", 22);
            Customer james = new Customer ("james", "james@gmail.com", 32);

            List<Customer> customers = List.of(alex, james);
            customerRepository.saveAll(customers);
        };
    }
}

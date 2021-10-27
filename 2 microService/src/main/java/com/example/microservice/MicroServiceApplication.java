package com.example.microservice;

import com.example.microservice.entity.Produit;
import com.example.microservice.repo.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceApplication.class, args);
        System.out.println("All RIGHT !!");
    }
    @Bean
    CommandLineRunner start(ProduitRepository produitRepository)
    {
        return args -> {
            produitRepository.save(new Produit(1,"HP",10,5000));
            produitRepository.save(new Produit(2,"DELL",55,7000));
            produitRepository.save(new Produit(3,"ALIEN",2,15000));
            produitRepository.findAll().forEach(p->{
                System.out.println(p.getName());
            });
        };
    }

}

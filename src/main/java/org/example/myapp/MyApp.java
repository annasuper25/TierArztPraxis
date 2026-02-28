package org.example.myapp;

import org.example.myapp.service.OwnerService;
import org.example.myapp.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {

    private final OwnerService ownerService;
    private final PetService petService;

    @Autowired
    public MyApp(OwnerService ownerService, PetService petService) {
        this.ownerService = ownerService;
        this.petService = petService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}

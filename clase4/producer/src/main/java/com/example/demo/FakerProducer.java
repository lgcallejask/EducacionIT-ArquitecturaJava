package com.example.demo;

import java.util.UUID;

import com.github.javafaker.Faker;

import org.springframework.stereotype.Component;

@Component
public class FakerProducer {
    
    Faker fk;

    public FakerProducer() {
        this.fk = new Faker();
    }
    
    public Usuario producir() {
        return new Usuario(
                fk.name().firstName(),
                fk.name().lastName(),
                fk.address().country(),
                UUID.randomUUID().toString()                
        );                
    }
}

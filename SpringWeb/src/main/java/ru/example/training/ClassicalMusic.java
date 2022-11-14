package ru.example.training;

import org.springframework.stereotype.Component;

@Component()
public class ClassicalMusic implements Music{

    public void doMyInit() {
        System.out.println("Initialized");
    }
    public void doMyDestroy() {
        System.out.println("Destroyed");
    }
    @Override
    public String getSong() {
        return "The best song";
    }
}

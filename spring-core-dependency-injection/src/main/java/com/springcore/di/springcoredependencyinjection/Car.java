package com.springcore.di.springcoredependencyinjection;

public class Car {
    private Engine engine;
    private String color;
    private int year;

    public Car(Engine engine, String color, int year) {
        this.engine = engine;
        this.color = color;
        this.year = year;
    }
    public void start(){
        System.out.println("Starting car with "+engine.getType()+" engine");
    }
}

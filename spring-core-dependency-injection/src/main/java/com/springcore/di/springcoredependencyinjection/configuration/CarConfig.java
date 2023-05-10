package com.springcore.di.springcoredependencyinjection.configuration;

import com.springcore.di.springcoredependencyinjection.Car;
import com.springcore.di.springcoredependencyinjection.ElectricEngine;
import com.springcore.di.springcoredependencyinjection.Engine;
import com.springcore.di.springcoredependencyinjection.GasolineEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
    @Bean
    public Car car(){
        return new Car(gasolineEngine(),"Blue",2023);
    }

    @Bean
    public Engine gasolineEngine(){
        return  new GasolineEngine();
    }
    @Bean
    public Engine electricEngine(){
        return  new ElectricEngine();
    }
}

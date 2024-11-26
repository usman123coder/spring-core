package com.balias.config;

import com.balias.beans.FuelTank;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app-config.properties")
public class BeanAliasConfig {

    @Bean(name = {"fuelTank","gasTank","petrolTank","dieselTank","tank"})
    public FuelTank fuelTank(@Value("${fuelTank.id}") int id,
                             @Value("${fuelTank.fuelType}") String fuelType,
                             @Value("${fuelTank.capacity}") String capacity){
        FuelTank fuelTank = new FuelTank();
        fuelTank.setId(id);
        fuelTank.setFuelType(fuelType);
        fuelTank.setCapacity(capacity);
        return fuelTank;
    }
}

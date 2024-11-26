package com.balias.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Objects;

//nosourcecode
//@Component("fuelTank")
//@Data
//@PropertySource("classpath:app-config.properties")
public class FuelTank {
    //@Value("${fuelTank.id}")
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    //@Value("${fuelTank.fuelType}")
    private String fuelType;
    //@Value("${fuelTank.capacity}")
    @Getter
    @Setter
    private String capacity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "FuelTank{" +
                "id=" + id +
                ", fuelType='" + fuelType + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FuelTank fuelTank = (FuelTank) o;
        return id == fuelTank.id && Objects.equals(fuelType, fuelTank.fuelType) && Objects.equals(capacity, fuelTank.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fuelType, capacity);
    }
}

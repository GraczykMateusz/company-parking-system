package dev.graczykmateusz.companyparkingsystem.domain.valueobjects;

import dev.graczykmateusz.companyparkingsystem.domain.exceptions.InvalidCapacityException;

public record Capacity(int value) {
    
    public Capacity {
        if (value < 0) {
            throw new InvalidCapacityException("Parking capacity cannot be less than zero!");
        }
    }
    
    public Capacity of(int value) {
        return new Capacity(value);
    }
}

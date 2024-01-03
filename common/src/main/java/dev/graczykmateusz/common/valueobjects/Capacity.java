package dev.graczykmateusz.common.valueobjects;

public record Capacity(int value) {
    
    public Capacity {
        if (value < 0) {
            throw new RuntimeException("Parking capacity cannot be less than zero!");
        }
    }
    
    public Capacity of(int value) {
        return new Capacity(value);
    }
}

package dev.graczykmateusz.companyparkingsystem.domain.valueobjects;


public record Capacity(int value) {
    
    public Capacity {
        if (value < 0) {
            throw new RuntimeException();
        }
    }
    
    public Capacity of(int value) {
        return new Capacity(value);
    }
}

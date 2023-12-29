package dev.graczykmateusz.companyparkingsystem.domain.exceptions;

public class InvalidCapacityException extends RuntimeException {
    
    public InvalidCapacityException(String message) {
        super(message);
    }
}

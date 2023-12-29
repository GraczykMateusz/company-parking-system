package dev.graczykmateusz.companyparkingsystem.domain.exceptions;

public class InvalidReservationException extends RuntimeException {
    
    public InvalidReservationException(String message) {
        super(message);
    }
}

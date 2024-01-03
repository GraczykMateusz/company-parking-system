package dev.graczykmateusz.domain.reservation;

public class InvalidReservationException extends RuntimeException {
    
    public InvalidReservationException(String message) {
        super(message);
    }
}

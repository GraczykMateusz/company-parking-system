package dev.graczykmateusz.companyparkingsystem.domain.reservation;

class InvalidReservationException extends RuntimeException {
    
    InvalidReservationException(String message) {
        super(message);
    }
}

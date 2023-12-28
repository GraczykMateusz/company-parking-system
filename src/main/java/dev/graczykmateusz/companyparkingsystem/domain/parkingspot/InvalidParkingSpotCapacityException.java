package dev.graczykmateusz.companyparkingsystem.domain.parkingspot;

class InvalidParkingSpotCapacityException extends RuntimeException {
    
    InvalidParkingSpotCapacityException(String message) {
        super(message);
    }
}

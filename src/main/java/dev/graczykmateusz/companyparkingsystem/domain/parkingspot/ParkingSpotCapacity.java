package dev.graczykmateusz.companyparkingsystem.domain.parkingspot;


public record ParkingSpotCapacity(int value) {
    
    public ParkingSpotCapacity {
        if (value < 0) {
            throw new InvalidParkingSpotCapacityException("Parking capacity cannot be less than zero!");
        }
    }
    
    public ParkingSpotCapacity of(int value) {
        return new ParkingSpotCapacity(value);
    }
}

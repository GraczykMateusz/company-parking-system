package dev.graczykmateusz.companyparkingsystem.domain.parkingspot;

import java.io.Serializable;
import java.util.UUID;

public record ParkingSpotId(UUID value) implements Serializable {
    
    public static ParkingSpotId of(UUID value) {
        return new ParkingSpotId(value);
    }
}

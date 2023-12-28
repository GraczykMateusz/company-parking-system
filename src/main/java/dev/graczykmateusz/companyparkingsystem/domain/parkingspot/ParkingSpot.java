package dev.graczykmateusz.companyparkingsystem.domain.parkingspot;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "parking_spots")
@Getter(AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ParkingSpot {
    
    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "id"))
    private ParkingSpotId id;
    
    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "capacity"))
    private ParkingSpotCapacity capacity;
    
    public ParkingSpot(ParkingSpotId id, ParkingSpotCapacity capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}

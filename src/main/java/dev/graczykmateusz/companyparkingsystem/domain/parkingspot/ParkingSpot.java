package dev.graczykmateusz.companyparkingsystem.domain.parkingspot;

import dev.graczykmateusz.companyparkingsystem.domain.valueobjects.Capacity;
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
    private Capacity capacity;
    
    public ParkingSpot(ParkingSpotId id, Capacity capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}

package dev.graczykmateusz.infrastructure.reservation;

import dev.graczykmateusz.common.valueobjects.LicensePlate;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reservations")
@Getter(AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReservationEntity {

    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "id"))
    private ReservationId id;
    
    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "parking_spot_id"))
    private ParkingSpotId parkingSpotId;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "license_plate"))
    private LicensePlate licensePlate;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "date"))
    private ReservationDate date;

    @Enumerated(EnumType.STRING)
    private ReservationState state;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private WeeklyReservations weeklyReservations;
    
    public ReservationEntity(ReservationId id, ParkingSpotId parkingSpotId, LicensePlate licensePlate, ReservationDate date) {
        this.id = id;
        this.parkingSpotId = parkingSpotId;
        this.licensePlate = licensePlate;
        this.date = date;
        this.state = ReservationState.NOT_SET;
    }
    
    void markAsVerified() {
        this.state = ReservationState.VERIFIED;
    }
    
    void markAsIncorrect() {
        this.state = ReservationState.INCORRECT;
    }
}

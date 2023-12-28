package dev.graczykmateusz.companyparkingsystem.domain.reservation;

import dev.graczykmateusz.companyparkingsystem.domain.parkingspot.ParkingSpotId;
import dev.graczykmateusz.companyparkingsystem.domain.valueobjects.LicensePlate;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reservations")
@Getter(AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
class Reservation {

    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "id"))
    private ReservationId id;

    private ParkingSpotId parkingSpotId;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "license_plate"))
    private LicensePlate licensePlate;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "date"))
    private ReservationDate date;

    @Enumerated(EnumType.STRING)
    private ReservationState state;

    Reservation(ReservationId id, ParkingSpotId parkingSpotId, LicensePlate licensePlate,
                ReservationDate date, ReservationState state) {
        this.id = id;
        this.parkingSpotId = parkingSpotId;
        this.licensePlate = licensePlate;
        this.date = date;
        this.state = state;
    }
}

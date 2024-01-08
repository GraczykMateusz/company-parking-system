package dev.graczykmateusz.domain.reservation;

import dev.graczykmateusz.common.valueobjects.LicensePlate;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reservations")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter(AccessLevel.PROTECTED)
class Reservation {
    
    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "id"))
    private ReservationId id;
    
    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "license_plate"))
    private LicensePlate licensePlate;
    
    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "date"))
    private ReservationDate date;
    
    @Enumerated(EnumType.STRING)
    private ReservationState state;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "weekly_reservations_id")
    private WeeklyReservations weeklyReservations;
    
    public Reservation(ReservationId id, LicensePlate licensePlate, ReservationDate date) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.date = date;
        this.state = ReservationState.NOT_SET;
    }
    
    public void markAsVerified() {
        this.state = ReservationState.CORRECT;
    }
    
    public void markAsIncorrect() {
        this.state = ReservationState.INCORRECT;
    }
}

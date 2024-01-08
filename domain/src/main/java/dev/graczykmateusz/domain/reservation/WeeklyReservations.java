package dev.graczykmateusz.domain.reservation;

import dev.graczykmateusz.common.valueobjects.Week;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "weekly_reservations")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter(AccessLevel.PROTECTED)
public class WeeklyReservations {
    
    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "id"))
    private WeeklyReservationId id;
    
    @Embedded
    private Week week;
    
    @OneToMany(mappedBy = "weeklyReservations")
    private Set<Reservation> reservations;
    
    public WeeklyReservations(WeeklyReservationId id, Week week, Set<Reservation> reservations) {
        this.id = id;
        this.week = week;
        this.reservations = reservations;
    }
    
    void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }
}

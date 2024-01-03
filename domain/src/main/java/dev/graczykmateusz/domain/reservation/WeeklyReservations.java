package dev.graczykmateusz.domain.reservation;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "weekly_reservations")
public class WeeklyReservations {
    
    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "id"))
    private WeeklyReservationId id;
    
    @OneToMany(mappedBy = "weeklyReservations")
    private Set<Reservation> reservations;
    
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }
}

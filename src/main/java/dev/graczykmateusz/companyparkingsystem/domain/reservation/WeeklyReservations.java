package dev.graczykmateusz.companyparkingsystem.domain.reservation;

import dev.graczykmateusz.companyparkingsystem.domain.exceptions.InvalidReservationException;
import dev.graczykmateusz.companyparkingsystem.domain.politicies.ReservationPolicy;
import dev.graczykmateusz.companyparkingsystem.domain.valueobjects.JobTitle;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
public class WeeklyReservations {
    
    private final Set<ReservationPolicy> reservationPolicies;
    private final Set<Reservation> reservations;
    private final JobTitle jobTitle;
    
    public void addReservation(Reservation reservation) {
        ReservationPolicy reservationPolicy = reservationPolicies.stream()
                .filter(rp -> rp.canBeApplied(jobTitle))
                .findFirst()
                .orElseThrow(() -> new InvalidReservationException("Cannot find "));
        
        if (!reservationPolicy.canReserve(reservations)) {
            throw new InvalidReservationException("");
        }
        
        reservations.add(reservation);
    }
}

package dev.graczykmateusz.companyparkingsystem.domain.politicies;

import dev.graczykmateusz.companyparkingsystem.domain.reservation.Reservation;
import dev.graczykmateusz.companyparkingsystem.domain.valueobjects.JobTitle;

import java.util.Collection;

public class BossReservationPolicy implements ReservationPolicy {
    
    @Override
    public boolean canBeApplied(JobTitle jobTitle) {
        return jobTitle.equals(JobTitle.BOSS);
    }
    
    @Override
    public boolean canReserve(Collection<Reservation> reservations) {
        return false;
    }
}

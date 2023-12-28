package dev.graczykmateusz.companyparkingsystem.domain.reservation;

import dev.graczykmateusz.companyparkingsystem.domain.valueobjects.JobTitle;

import java.util.Collection;

class BossReservationPolicy implements ReservationPolicy {
    
    @Override
    public boolean canBeApplied(JobTitle jobTitle) {
        return jobTitle.equals(JobTitle.BOSS);
    }
    
    @Override
    public boolean canReserve(Collection<Reservation> reservations) {
        return false;
    }
}

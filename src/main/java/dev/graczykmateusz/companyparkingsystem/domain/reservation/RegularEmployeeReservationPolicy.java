package dev.graczykmateusz.companyparkingsystem.domain.reservation;

import dev.graczykmateusz.companyparkingsystem.domain.valueobjects.JobTitle;
import lombok.RequiredArgsConstructor;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Collection;

@RequiredArgsConstructor
class RegularEmployeeReservationPolicy implements ReservationPolicy {
    
    private final Clock clock;
    
    @Override
    public boolean canBeApplied(JobTitle jobTitle) {
        return jobTitle.equals(JobTitle.REGULAR_EMPLOYEE);
    }
    
    @Override
    public boolean canReserve(Collection<Reservation> reservations) {
        return reservations.size() <= 4 && LocalDateTime.now(clock).getHour() > 11;
    }
}

package dev.graczykmateusz.domain.reservation;

import dev.graczykmateusz.common.valueobjects.JobTitle;

import java.util.Collection;

public interface ReservationPolicy {

    boolean canBeApplied(JobTitle jobTitle);
    boolean canReserve(Collection<Reservation> reservations);
}

package dev.graczykmateusz.companyparkingsystem.domain.reservation;

import dev.graczykmateusz.companyparkingsystem.domain.valueobjects.JobTitle;

import java.util.Collection;

interface ReservationPolicy {

    boolean canBeApplied(JobTitle jobTitle);
    boolean canReserve(Collection<Reservation> reservations);
}

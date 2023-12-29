package dev.graczykmateusz.companyparkingsystem.domain.politicies;

import dev.graczykmateusz.companyparkingsystem.domain.reservation.Reservation;
import dev.graczykmateusz.companyparkingsystem.domain.valueobjects.JobTitle;

import java.util.Collection;

public interface ReservationPolicy {

    boolean canBeApplied(JobTitle jobTitle);
    boolean canReserve(Collection<Reservation> reservations);
}

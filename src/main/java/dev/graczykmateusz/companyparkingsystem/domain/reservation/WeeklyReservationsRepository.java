package dev.graczykmateusz.companyparkingsystem.domain.reservation;

public interface WeeklyReservationsRepository {
    
    <S extends Reservation> S save(S reservation);
}

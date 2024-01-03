package dev.graczykmateusz.domain.reservation;

public interface WeeklyReservationsRepository {
    
    <S extends Reservation> S save(S reservation);
}

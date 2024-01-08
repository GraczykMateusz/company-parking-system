package dev.graczykmateusz.domain.reservation;

public interface WeeklyReservationsRepository {
    
    <S extends WeeklyReservations> S save(S WeeklyReservations);
}

package dev.graczykmateusz.infrastructure.reservation;

import dev.graczykmateusz.domain.reservation.WeeklyReservations;
import dev.graczykmateusz.domain.reservation.WeeklyReservationsRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class WeeklyReservationsRepositoryImpl implements WeeklyReservationsRepository {
    
    private final WeeklyReservationsJpaRepository repo;
    
    @Override
    public <S extends WeeklyReservations> S save(S weeklyReservations) {
        return repo.save(weeklyReservations);
    }
}

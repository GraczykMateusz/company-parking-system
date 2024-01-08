package dev.graczykmateusz.infrastructure.reservation;

import dev.graczykmateusz.domain.reservation.WeeklyReservationId;
import dev.graczykmateusz.domain.reservation.WeeklyReservations;
import org.springframework.data.jpa.repository.JpaRepository;

interface WeeklyReservationsJpaRepository extends JpaRepository<WeeklyReservations, WeeklyReservationId> {

}

package dev.graczykmateusz.companyparkingsystem.infrastructure.persistence.reservation;

import dev.graczykmateusz.companyparkingsystem.domain.reservation.WeeklyReservationId;
import dev.graczykmateusz.companyparkingsystem.domain.reservation.WeeklyReservations;
import dev.graczykmateusz.companyparkingsystem.domain.reservation.WeeklyReservationsRepository;
import org.springframework.data.jpa.repository.JpaRepository;

interface WeeklyReservationsJpaRepository
        extends JpaRepository<WeeklyReservations, WeeklyReservationId>, WeeklyReservationsRepository {

}

package dev.graczykmateusz.presentation;

import dev.graczykmateusz.common.valueobjects.Week;
import dev.graczykmateusz.domain.reservation.WeeklyReservationId;
import dev.graczykmateusz.domain.reservation.WeeklyReservations;
import dev.graczykmateusz.domain.reservation.WeeklyReservationsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashSet;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/x")
@RequiredArgsConstructor
class WeeklyReservationsController {
    
    private final WeeklyReservationsRepository weeklyReservationsRepository;
    
    @GetMapping
    String x() {
        WeeklyReservations weeklyReservations = new WeeklyReservations(
                new WeeklyReservationId(UUID.randomUUID()),
                new Week(Instant.MIN, Instant.MAX),
                new HashSet<>()
        );
        weeklyReservationsRepository.save(weeklyReservations);
        return "{\"x\": \"x\"}";
    }
}

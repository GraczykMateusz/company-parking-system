package dev.graczykmateusz.infrastructure.reservation;

import dev.graczykmateusz.domain.reservation.WeeklyReservationsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration(proxyBeanMethods = false)
class WeeklyReservationsConfiguration {
    
    private final WeeklyReservationsJpaRepository weeklyReservationsJpaRepository;
    
    @Bean
    WeeklyReservationsRepository weeklyReservationsRepository() {
        return new WeeklyReservationsRepositoryImpl(weeklyReservationsJpaRepository);
    }
}

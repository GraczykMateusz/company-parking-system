package dev.graczykmateusz.companyparkingsystem.domain.reservation;

import lombok.Value;

import java.time.LocalDateTime;

@Value(staticConstructor = "of")
class ReservationDate {
    
    LocalDateTime value;
}

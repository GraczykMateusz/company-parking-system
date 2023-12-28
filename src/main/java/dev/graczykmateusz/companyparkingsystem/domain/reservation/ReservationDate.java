package dev.graczykmateusz.companyparkingsystem.domain.reservation;

import java.time.LocalDate;

public record ReservationDate(LocalDate value) {
    
    public static ReservationDate of(LocalDate value) {
        return new ReservationDate(value);
    }
}

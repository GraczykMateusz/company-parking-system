package dev.graczykmateusz.companyparkingsystem.domain.reservation;

import java.time.LocalDate;

public record ReservationDate(LocalDate value) {
    
    public ReservationDate {
        if (value.isBefore(LocalDate.now())) {
            throw new RuntimeException();
        }
    }
    
    public static ReservationDate of(LocalDate value) {
        return new ReservationDate(value);
    }
}

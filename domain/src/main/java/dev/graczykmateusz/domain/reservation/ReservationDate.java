package dev.graczykmateusz.domain.reservation;

import java.time.Instant;

public record ReservationDate(Instant value) {
    
    public static ReservationDate of(Instant value) {
        return new ReservationDate(value);
    }
}

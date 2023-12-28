package dev.graczykmateusz.companyparkingsystem.domain.reservation;

import java.io.Serializable;
import java.util.UUID;

public record ReservationId(UUID value) implements Serializable {
    
    public static ReservationId of(UUID value) {
        return new ReservationId(value);
    }
}

package dev.graczykmateusz.companyparkingsystem.domain.reservation;

import java.io.Serializable;
import java.util.UUID;

public record WeeklyReservationId(UUID value) implements Serializable {
    
    public static WeeklyReservationId of(UUID value) {
        return new WeeklyReservationId(value);
    }
}

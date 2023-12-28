package dev.graczykmateusz.companyparkingsystem.domain.reservation;

import java.io.Serializable;
import java.util.UUID;

public record ReservationId(UUID value) implements Serializable {

}

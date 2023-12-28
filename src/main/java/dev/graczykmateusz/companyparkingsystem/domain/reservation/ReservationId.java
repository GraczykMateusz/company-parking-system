package dev.graczykmateusz.companyparkingsystem.domain.reservation;

import lombok.Value;

import java.util.UUID;

@Value(staticConstructor = "of")
class ReservationId {
    
    UUID value;
}

package dev.graczykmateusz.companyparkingsystem.domain.spot;

import java.io.Serializable;
import java.util.UUID;

public record ParkingSpotId(UUID value) implements Serializable {
}

package dev.graczykmateusz.companyparkingsystem.domain.reservation;

import dev.graczykmateusz.companyparkingsystem.domain.spot.ParkingSpotId;
import dev.graczykmateusz.companyparkingsystem.domain.valueobjects.LicensePlate;

public class Reservation {
    
    private ReservationId id;
    private ParkingSpotId parkingSpotId;
    private LicensePlate licensePlate;
    private ReservationDate date;
    private ReservationState state;
    
    public void changeState(ReservationState newState) {
        this.state = newState;
    }
}

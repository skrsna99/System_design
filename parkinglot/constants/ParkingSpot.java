package sonal.System_design.parkinglot.constants; // Ensure correct package structure

import sonal.System_design.parkinglot.constants.Constants.ParkingSpotType; // Correct import

public class ParkingSpot {
    private String spotId;
    private ParkingSpotType type;
    private boolean isOccupied;

    public ParkingSpot(String spotId, ParkingSpotType type) {
        this.spotId = spotId;
        this.type = type;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void occupy() {
        isOccupied = true;
    }

    public void free() {
        isOccupied = false;
    }

    public ParkingSpotType getType() {
        return type;
    }
}

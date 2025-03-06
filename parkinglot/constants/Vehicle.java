package sonal.System_design.parkinglot.constants; // Ensure correct package structure

import sonal.System_design.parkinglot.constants.Constants.VehicleType;

public class Vehicle {
    private String licensePlate;
    private VehicleType type;

    public Vehicle(String licensePlate, VehicleType type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public VehicleType getType() { return type; }
    public String getLicensePlate() { return licensePlate; }
}

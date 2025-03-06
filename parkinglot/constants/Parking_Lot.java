package sonal.System_design.parkinglot.constants;
import sonal.System_design.parkinglot.constants.Constants.ParkingSpotType;
import sonal.System_design.parkinglot.constants.Constants.VehicleType;
import sonal.System_design.parkinglot.constants.Constants.PaymentMethod;
import java.util.*;

public class Parking_Lot {
    private static Parking_Lot instance;
    private final int capacity = 40000;
    private int occupiedSpots = 0;
    private List<ParkingSpot> spots = new ArrayList<>();
    private DisplayBoard displayBoard = new DisplayBoard();

    private Parking_Lot() {
        for (int i = 0; i < capacity; i++) {
            ParkingSpotType type = switch (i % 4) {
                case 0 -> ParkingSpotType.HANDICAPPED;
                case 1 -> ParkingSpotType.COMPACT;
                case 2 -> ParkingSpotType.LARGE;
                default -> ParkingSpotType.MOTORCYCLE;
            };
            spots.add(new ParkingSpot("S" + i, type));
        }
    }

    public static Parking_Lot getInstance() {
        if (instance == null) instance = new Parking_Lot();
        return instance;
    }

    public ParkingTicket parkVehicle(Vehicle vehicle) {
        if (occupiedSpots >= capacity) {
            System.out.println("Parking Lot Full!");
            return null;
        }
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied() && spot.getType() == getSpotTypeForVehicle(vehicle.getType())) {
                spot.occupy();
                occupiedSpots++;
                return new ParkingTicket(vehicle);
            }
        }
        System.out.println("No available spots for " + vehicle.getType());
        return null;
    }

    public void exitVehicle(ParkingTicket ticket, PaymentMethod method) {
        if (ticket != null && !ticket.isPaid()) {
            PaymentProcessor.processPayment(ticket, method);
        }
        occupiedSpots--;
    }

    private ParkingSpotType getSpotTypeForVehicle(VehicleType type) {
        return switch (type) {
            case CAR -> ParkingSpotType.COMPACT;
            case TRUCK, VAN -> ParkingSpotType.LARGE;
            case MOTORCYCLE -> ParkingSpotType.MOTORCYCLE;
        };
    }
}




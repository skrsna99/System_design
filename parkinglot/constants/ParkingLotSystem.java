package sonal.System_design.parkinglot.constants;
import sonal.System_design.parkinglot.constants.Constants.ParkingSpotType;
import sonal.System_design.parkinglot.constants.Constants.VehicleType;
import sonal.System_design.parkinglot.constants.Constants.PaymentMethod;

public class ParkingLotSystem {public static void main(String[] args) {
    Parking_Lot parkingLot = Parking_Lot.getInstance();

    Vehicle car = new Vehicle("ABC123", VehicleType.CAR);
    ParkingTicket ticket = parkingLot.parkVehicle(car);
    if (ticket != null) {
        System.out.println("Car parked with Ticket ID: " + ticket.getTicketId());
        parkingLot.exitVehicle(ticket, PaymentMethod.CREDIT_CARD);
    }
}
}

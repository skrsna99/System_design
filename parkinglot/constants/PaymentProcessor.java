package sonal.System_design.parkinglot.constants;
import sonal.System_design.parkinglot.constants.Constants.ParkingSpotType;

public class PaymentProcessor {public static boolean processPayment(ParkingTicket ticket, Constants.PaymentMethod method) {
    System.out.println("Payment of $" + ticket.calculateFee() + " received via " + method);
    ticket.markPaid();
    return true;
}
}

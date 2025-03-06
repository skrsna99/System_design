package sonal.System_design.parkinglot.constants;
import java.util.UUID;
import sonal.System_design.parkinglot.constants.Constants.PaymentMethod;//

public class ParkingTicket {
    private String ticketId;
    private Vehicle vehicle;
    private long entryTime;
    private boolean isPaid;

    public ParkingTicket(Vehicle vehicle) {
        this.ticketId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.entryTime = System.currentTimeMillis();
        this.isPaid = false;
    }

    public long calculateFee() {
        long currentTime = System.currentTimeMillis();
        long hours = (currentTime - entryTime) / (1000 * 60 * 60) + 1;
        return hours * 10;
    }

    public void markPaid() { this.isPaid = true; }
    public boolean isPaid() { return isPaid; }
    public String getTicketId() { return ticketId; }
}

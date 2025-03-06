package sonal.System_design.parkinglot.constants;
import java.util.HashMap;
import java.util.Map;
import sonal.System_design.parkinglot.constants.Constants.ParkingSpotType;
public class DisplayBoard {private Map<ParkingSpotType, Integer> availableSpots = new HashMap<>();

    public void updateSpotCount(ParkingSpotType type, int count) {
        availableSpots.put(type, count);
    }

    public void showAvailability() {
        System.out.println("Parking Spot Availability:");
        for (var entry : availableSpots.entrySet()) {
            System.out.println(entry.getKey() + " spots: " + entry.getValue());
        }
    }
}

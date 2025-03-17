package sonal.System_design.Elevator_System.Constants;
import java.util.ArrayList;
import java.util.List;

public class Building {
    private List <Floor> floors;
    private List<ElevatorCar>elevators;
    private static Building building = null;

    private Building(){
        floors = new ArrayList<>();
        elevators = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            floors.add(new Floor());
        }
        for (int i = 1; i <= 3; i++) {
            elevators.add(new ElevatorCar(i,15));
        }
    }
    public static Building getInstance(){
        if(building == null){
            building = new Building();
        }
        return building;
    }
}

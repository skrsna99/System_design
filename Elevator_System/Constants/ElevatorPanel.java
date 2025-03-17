package sonal.System_design.Elevator_System.Constants;
import java.util.ArrayList;
import java.util.List;

public class ElevatorPanel {
    private List<ElevatorButton> floorButtons;
    private DoorButton openButton;
    private DoorButton closeButton;

    public ElevatorPanel(int maxFloors){
        floorButtons = new ArrayList<>();
        for (int i = 1;i <=maxFloors; i++){
            floorButtons.add(new ElevatorButton(i));
        }
        openButton = new DoorButton();
        closeButton = new DoorButton();
    }
}

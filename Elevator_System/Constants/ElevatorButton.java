package sonal.System_design.Elevator_System.Constants;

public class ElevatorButton extends Button{
    private int destinationFloorNumber;

    public ElevatorButton(int floor) {
        this.destinationFloorNumber = floor;
    }
    @Override
    public void pressDown(){
        status = true;
    }
    @Override
    public boolean isPressed(){
        return status;
    }
    public int getDestinationFloorNumber() {
        return destinationFloorNumber;
    }
}

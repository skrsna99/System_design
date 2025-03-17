package sonal.System_design.Elevator_System.Constants;

public class DoorButton  extends Button{
    @Override
    public void pressDown(){
        status =!status;
    }
    @Override
    public boolean isPressed(){
        return status;
    }
}

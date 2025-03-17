package sonal.System_design.Elevator_System.Constants;

public class Door {
    private DoorState state;

    public Door(){
        this.state= DoorState.CLOSE;
    }
    public boolean isOpen(){
        return state==DoorState.OPEN;
    }
}

package sonal.System_design.Elevator_System.Constants;

public  abstract class Button {
    protected boolean status;
    public abstract void pressDown();
    public abstract boolean isPressed();
}

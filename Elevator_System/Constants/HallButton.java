package sonal.System_design.Elevator_System.Constants;

public class HallButton extends Button{
    private Direction buttonSign;

    public HallButton(Direction buttonSign) {
        this.buttonSign = buttonSign;
    }
@Override
    public void pressDown(){
        status =true;
}
@Override
    public boolean isPressed(){
        return status;
}
}

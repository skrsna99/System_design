package sonal.System_design.Elevator_System.Constants;

public class  HallPanel {
    private HallButton up;
    private HallButton down;

    public HallPanel(){
        up = new HallButton(Direction.UP);
        down = new HallButton(Direction.DOWN);
    }
}

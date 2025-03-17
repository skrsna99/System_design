package sonal.System_design.Elevator_System.Constants;

public class Floor {
    private Display display;
    private HallPanel panel;

    public Floor(){
        display = new Display();
        panel = new HallPanel();
    }
}

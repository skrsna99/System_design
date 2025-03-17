package sonal.System_design.Elevator_System.Constants;

public class Display {
    private int floor;
    private int capacity;
    private Direction direction;

    public void showElevator(){
        System.out.println("Elevator at floor :"+floor+"|Direction:"+direction);
    }
    public void showHallDisplay(){

        System.out.println("Floor: "+ floor+ "|Direction"+direction);
    }
}

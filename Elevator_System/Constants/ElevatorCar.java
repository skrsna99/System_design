package sonal.System_design.Elevator_System.Constants;

public class ElevatorCar {
    private int id;
    private Door door;
    private ElevatorState state;
    private Display display;
    private ElevatorPanel panel;

    public ElevatorCar(int id,int maxFloors){
        this.id = id;
        this.door = new Door();
        this.state=ElevatorState.IDLE;
        this.display=new Display();
        this.panel = new ElevatorPanel(maxFloors);
    }
    public void move(){}
    public void stop(){}
    public void openDoor(){}
    public void closeDoor(){}
}

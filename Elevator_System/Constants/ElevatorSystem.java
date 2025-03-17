package sonal.System_design.Elevator_System.Constants;

public class ElevatorSystem {
    private Building building;
    private static ElevatorSystem system = null;

    private ElevatorSystem() {
        building = Building.getInstance();
    }
    public static ElevatorSystem getInstance() {
        if (system == null) {
            system = new ElevatorSystem();
        }
        return system;
    }
    public void monitoring (){}
    public void dispatcher(){}
}

import java.util.*;

class Road {
    private Queue<Vehicle> northLane = new LinkedList<>();
    private Queue<Vehicle> southLane = new LinkedList<>();
    private Queue<Vehicle> eastLane = new LinkedList<>();
    private Queue<Vehicle> westLane = new LinkedList<>();

    public void addVehicle(Vehicle v) {
        String dir = v.getDirection();

        if (dir.equals("NORTH")) northLane.add(v);
        else if (dir.equals("SOUTH")) southLane.add(v);
        else if (dir.equals("EAST")) eastLane.add(v);
        else if (dir.equals("WEST")) westLane.add(v);
        else {
            System.out.println("Invalid direction!");
            return;
        }

        System.out.println(v.getId() + " added to " + dir);
    }

    public void moveVehicles(String signalColor, String activeDirection) {
        if (!signalColor.equals("GREEN")) {
            System.out.println("Signal not GREEN. Vehicles waiting...");
            return;
        }

        Queue<Vehicle> lane = getLane(activeDirection);

        if (lane.isEmpty()) {
            System.out.println("No vehicles in " + activeDirection);
        } else {
            Vehicle v = lane.poll();
            v.move();
        }
    }

    private Queue<Vehicle> getLane(String dir) {
        if (dir.equals("NORTH")) return northLane;
        if (dir.equals("SOUTH")) return southLane;
        if (dir.equals("EAST")) return eastLane;
        return westLane;
    }

    public void display() {
        System.out.println("\nLane Status:");
        print("NORTH", northLane);
        print("SOUTH", southLane);
        print("EAST", eastLane);
        print("WEST", westLane);
    }

    private void print(String name, Queue<Vehicle> lane) {
        System.out.print(name + ": ");
        if (lane.isEmpty()) {
            System.out.println("Empty");
            return;
        }

        for (Vehicle v : lane) {
            System.out.print(v.getId() + " ");
        }
        System.out.println();
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Road road = new Road();
        Signal signal = new Signal();

        String activeDirection = "NORTH";
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Change Signal");
            System.out.println("3. Set Direction");
            System.out.println("4. Move Vehicle");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("1.Car 2.Bike 3.Truck");
                    int type = sc.nextInt();

                    System.out.print("Enter ID: ");
                    String id = sc.next();

                    System.out.print("Enter Direction (NORTH/SOUTH/EAST/WEST): ");
                    String dir = sc.next();

                    Vehicle v = null;

                    if (type == 1) v = new Car(id, dir);
                    else if (type == 2) v = new Bike(id, dir);
                    else if (type == 3) v = new Truck(id, dir);

                    road.addVehicle(v);
                    break;

                case 2:
                    signal.changeSignal();
                    break;

                case 3:
                    System.out.print("Enter active direction: ");
                    activeDirection = sc.next().toUpperCase();
                    break;

                case 4:
                    road.moveVehicles(signal.getColor(), activeDirection);
                    break;

                case 5:
                    road.display();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;
            }

        } while (choice != 6);
    }
}
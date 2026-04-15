abstract class Vehicle {
    private String id;
    private String direction;

    public Vehicle(String id, String direction) {
        this.id = id;
        this.direction = direction.toUpperCase();
    }

    public String getId() {
        return id;
    }

    public String getDirection() {
        return direction;
    }

    public abstract void move();
}

class Car extends Vehicle {
    public Car(String id, String direction) {
        super(id, direction);
    }

    public void move() {
        System.out.println("Car " + getId() + " is moving towards " + getDirection());
    }
}

class Bike extends Vehicle {
    public Bike(String id, String direction) {
        super(id, direction);
    }

    public void move() {
        System.out.println("Bike " + getId() + " is moving towards " + getDirection());
    }
}

class Truck extends Vehicle {
    public Truck(String id, String direction) {
        super(id, direction);
    }

    public void move() {
        System.out.println("Truck " + getId() + " is moving towards " + getDirection());
    }
}
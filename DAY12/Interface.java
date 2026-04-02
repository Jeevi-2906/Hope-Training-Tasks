class Engine{
    void on()//6
    {
        System.out.println("Engine has turn on");
    }
}

class Car{
    Engine e;
    Car(){//2
        e = new Engine();
    }
    void start(){//4
        e.on();//5
        System.out.println("Car has started");
    }
}

public class Main{
    public static void main(String[] args)
    {
        Car c = new Car();//1
        c.start();//3
    }
}
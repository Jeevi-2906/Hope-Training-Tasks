//Single inheritance

class Animal
{
    void eat()
    {
        System.out.println("animal is eating");
    }
}

class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat meows");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Cat c = new Cat();
        c.eat();
        c.sound();

    }
}

//Multilevel inheritance
class Animal
{
    void eat()
    {
        System.out.println("animal is eating");
    }
}

class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat meows");
    }
}

class Puppy extends Cat
{
    void play()
    {
        System.out.println("Puppy is playing")
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Puppy p = new Puppy();
        p.eat();
        p.sound();
        p.play();
    }
}

//Hierachical inheritance
class Animal
{
    void eat()
    {
        System.out.println("animal is eating");
    }
}

class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal
{
    void play()
    {
        System.out.println("Dog barks")
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Cat c = new Cat();
        c.eat();    
        c.sound();
        Dog d = new Dog();
        d.eat();
        d.sound();
    }
}
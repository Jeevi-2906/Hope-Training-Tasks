interface Mom{
    void hs();
}
interface Dad{
    void Business();
}

class Child implements Mom,Dad{
    public void hs()
    {
        System.out.println("I will do enggg");
    }
    public void Business()
    {
        System.out.println("I will do MBA in iim then startup");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.hs();
        c.Business();
    }
}
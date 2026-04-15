package model;

public abstract class Account
{
    private int acc_no;
    private String name;
    protected double bal;

    public Account(int acc_no, String name, double bal)    {
        this.acc_no = acc_no;
        this.name = name;
        this.bal = bal;
    }
    public int get_acc_no(){
        return acc_no;
    }
    public String get_name(){
        return name;
    }
    public double get_bal(){
        return bal;
    }

    public void deposit(double amt)
    {
        bal = bal + amt;
    }

    public abstract void withdraw(double amt);

    public void view_acc()
    {
        System.out.println("\n Account no:"+acc_no+"\n Customer name:"+name+"\n Balance amt:"+bal);
    }
}

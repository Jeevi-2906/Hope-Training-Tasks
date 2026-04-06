package model;

public class Existing extends Account
{
    public Existing(int acc_no, String name, double bal)
    {
        super(acc_no,name,bal);
    }

    @Override
    public void withdraw(double amt)
    {
        bal = bal - amt;
    }
}

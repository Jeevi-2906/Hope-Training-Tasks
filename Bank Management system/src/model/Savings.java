package model;

public class Savings extends Account
{
    public Savings(int acc_no,String name,double bal)
    {
        super(acc_no,name,bal);
    }

    @Override
    public void withdraw(double amt)
    {
        if(bal - amt >= 500)
        {
            bal = bal - amt;
        }
        else{
            System.out.println("Minimum balance required to withdraw");
        }
    }
}

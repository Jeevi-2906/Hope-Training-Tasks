package service;

import model.*;
import java.util.*;

public class Service{
    List<Account> accounts = new ArrayList<>();

    public void create(Account acc)
    {
        accounts.add(acc);
    }

    public Account isPresent(int acc_no) {
        for (Account acc : accounts) {
            if (acc.get_acc_no() == acc_no)
                return acc;
        }
        return null;
    }

    public void delete(int acc_no)
    {
        for(int i=0;i<accounts.size();i++)
        {
            if(accounts.get(i).get_acc_no() == acc_no)
            {
                accounts.remove(i);
                System.out.println("Account deleted");
                return;
            }
        }
        System.out.println("Account not found");
    }
    public void display()
    {
        for(Account acc : accounts)
        {
            acc.view_acc();
        }
    }
}
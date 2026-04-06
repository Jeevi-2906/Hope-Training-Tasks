package main;

import java.util.*;
import model.*;
import service.*;


class Main
{
    public static void  main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       Service bank = new Service();

       while (true)
       {
           System.out.println("\n ***** Welcome to ABC Bank ***** \n " +
                   "1. Create account \n " +
                   "2. Delete account \n " +
                   "3. Deposit amount \n " +
                   "4. Show balance \n" +
                   "5. Withdraw amount \n " +
                   "6. View account \n " +
                   "7. Exit \n" +
                   "Enter your choice : \n");
           int choice = sc.nextInt();
           sc.nextLine();

           switch(choice)
           {
               case 1:
                   System.out.println("Enter acc no: ");
                   int acc_no = sc.nextInt();
                   sc.nextLine();

                   System.out.println("Enter name: ");
                   String name = sc.nextLine();

                   System.out.println("Enter ur initial balance: ");
                   double bal = sc.nextDouble();

                   System.out.print("Enter Account Type (1: Savings, 2: Current): ");
                   int type = sc.nextInt();

                   Account acc;

                   if (type == 1) {
                       acc = new Savings(acc_no, name, bal);
                   } else {
                       acc = new Existing(acc_no, name, bal);
                   }

                   bank.create(acc);
                   System.out.println("Account Created!");
                   break;
               case 2:
                    System.out.println("Enter the acc no  which need to be deleted:");
                    acc_no = sc.nextInt();
                    bank.delete(acc_no);
                    break;
               case 3:
                   System.out.print("Enter acc no: ");
                   acc_no = sc.nextInt();

                   acc = bank.isPresent(acc_no);

                   if (acc != null) {
                       System.out.print("Enter Amount: ");
                       double amt = sc.nextDouble();
                       acc.deposit(amt);
                   } else {
                       System.out.println("Account not found!");
                   }
                   break;
               case 4:
                   System.out.print("Enter acc no: ");
                   acc_no = sc.nextInt();

                   acc = bank.isPresent(acc_no);

                   if (acc != null) {
                       System.out.println("Balance: " + acc.get_bal());
                   } else {
                       System.out.println("Account not found!");
                   }
                   break;
               case 5:
                   System.out.print("Enter acc no: ");
                   acc_no = sc.nextInt();

                   acc = bank.isPresent(acc_no);

                   if (acc != null) {
                       System.out.print("Enter Amount: ");
                       double amt = sc.nextDouble();
                       acc.withdraw(amt);
                   } else {
                       System.out.println("Account not found!");
                   }
                   break;
               case 6:
                   bank.display();
                   break;
               case 7:
                   System.exit(0);
               default:
                   System.out.println("Invalid choice");
           }
       }
    }
}
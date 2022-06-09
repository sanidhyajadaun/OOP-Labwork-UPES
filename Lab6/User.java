package Lab6;

import java.util.Scanner;

import Balance.Account;

public class User 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("\n---------------------------------------\n");
        System.out.print("Input the balance of the User :- ");
        double val = in.nextDouble();

        Account user1 = new Account(val);

        user1.Display_Balance();

        in.close();
        System.out.println("\n---------------------------------------\n");
    }
}

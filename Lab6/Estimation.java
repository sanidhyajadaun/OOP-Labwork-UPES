package Lab6;

import mathematic.*;

import java.util.Scanner;

class Estimation 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        power p = new power();   
        Exponential e = new Exponential();

        System.out.println("\n-------------------------------------------\n");
        System.out.print("Enter the number x : ");
        int x = in.nextInt();
        System.out.print("Enter the power of x (y): ");
        int y = in.nextInt();

        System.out.print("Enter the power of exponent (k): ");
        int k = in.nextInt();

        System.out.println("x^y : "+p.pow(x, y));
        System.out.println("e^k : "+e.Exp(k));

        in.close();
        System.out.println("\n-------------------------------------------\n");
    }  
}

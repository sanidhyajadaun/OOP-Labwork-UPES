package Lab5;

import java.util.Scanner; 

public class Calcmain implements Calculation
{
    
    @Override      
    public float division(int x1,int x2)
    {
        return (float)x1/x2;   
    }
    @Override    
    public int modules(int x1,int x2)
    {
        return x1%x2;   
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Calcmain object = new Calcmain();     
        System.out.println("\n----------------------------------\n");
        System.out.println("Enter two numbers one by one :- ");
        System.out.print("Enter number 1 :- ");
        int x1 = in.nextInt();
        System.out.print("Enter number 2 :- ");
        int x2 = in.nextInt();

        System.out.println("Division :- " + object.division(x1, x2));
        System.out.println("Modules :- "+object.modules(x1, x2));
        in.close();
        System.out.println("\n----------------------------------\n");
    }
}



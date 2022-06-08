package Lab5;

import java.util.Scanner; 
public class ToTestInt 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("------------------------------------------------------\n");   
        System.out.print("Enter the number whose square has to be find (int) :- ");
        int x = in.nextInt();
        arithmetic object = new arithmetic();  
        System.out.println("Square of the number :- "+object.square(x));   
        in.close();
        System.out.print("\n------------------------------------------------------"); 
    }    
}

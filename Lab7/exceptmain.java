package Lab7;

import java.util.Scanner; 

public class exceptmain
{
    public static void main(String[] args) throws myexception
    {
        Scanner in = new Scanner(System.in);
        try 
        {
            System.out.println("\n---------------------------------------------\n");
            System.out.print("Enter the number : ");
            int x = in.nextInt();
            if(x<500)
                throw new myexception(x);
            System.out.println("Entered number is : "+x);
            System.out.println("Number is greater than 500!");
        }
        catch(myexception e)
        {
            System.out.println(e);
        }
        finally 
        {
            in.close();
        }
        System.out.println("\n---------------------------------------------\n");
    }
}

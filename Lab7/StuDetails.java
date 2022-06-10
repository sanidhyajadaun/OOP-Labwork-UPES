package Lab7;

import java.util.Scanner;

public class StuDetails 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String[] names = {"Virat","Rohit","Dhoni","Rahul","Pandya","Bumrah","Shami","Shardul","Kumar","Pant"};
        int[] RollNo = {1,2,3,4,5,6,7,8,9,10};

        try
        {
            System.out.println("\n----------------------------------------------------------\n");
            System.out.print("Enter the Roll number of the students (upto 10) :- ");
            int x = in.nextInt();
            
            System.out.println("------------------Student Details--------------- \nRoll Number : "+RollNo[x-1]);
            System.out.println("Name of the student : "+names[x]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception...Array index out of bounds generated...!");
        }
        in.close();

        System.out.println("\n----------------------------------------------------------\n");
    }    
    
}

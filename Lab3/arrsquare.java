package Lab3;

import java.util.Scanner;
public class arrsquare {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter 10 elements of the array : ");
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter Element "+(i+1)+" : ");
            array[i] = in.nextInt();
        }
        int flag=0;
        System.out.println("Square of the number are : ");
        for(int j=0;j<10;j++)
        {
            System.out.printf("%d : %d\n",array[j],array[j]*array[j]);
            flag += (array[j]*array[j]);
        }
        System.out.println("Sum of all the squared numbers : "+flag);

        in.close();
    }
}

    
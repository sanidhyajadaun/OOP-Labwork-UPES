package Lab3;

import java.util.Scanner;
public class threedigit {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[3];
        System.out.println("Input three digits (0-9) : ");
        System.out.print("Enter the digit number 1 : ");
        arr[0] = in.nextInt();
        System.out.print("Enter the digit number 2 : ");
        arr[1]= in.nextInt();
        System.out.print("Enter the digit number 3 : ");
        arr[2] = in.nextInt();

        System.out.println("Possible Combinations of the three digits are : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int m=0;m<3;m++)
                {
                    if(i!=j && j!=m && m!=i)
                    {
                        System.out.printf("%d%d%d\n",arr[i],arr[j],arr[m]);
                    }
                }
            }
        }
        in.close();
    }
}

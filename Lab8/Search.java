package Lab8;


import java.util.Scanner;

public class Search 
{
    public static void main(String[] args)
    {
        System.out.println("\n---------------------------------------------------\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string :- ");
        String str = in.nextLine();

        System.out.print("Enter the character or substring of which have to be find first and then the last occurence :- ");
        String s = in.next();

        int fIndex = str.indexOf(s);
        int lIndex = str.lastIndexOf(s);
        if(fIndex==-1 && lIndex==-1)
        {
            System.out.println("Entered substring or character do not exist in the string");
        }
        else 
        {
            System.out.println("First occurence :- "+fIndex);
            System.out.println("Last occurence :- "+lIndex);
        }
        in.close();
        System.out.println("\n---------------------------------------------------\n");
    }    
    
}

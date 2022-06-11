package Lab8;

import java.util.Scanner;

public class Capital 
{
    public static void main(String[] args)
    {
        System.out.println("\n---------------------------------------------------\n");
        StringBuffer str = new StringBuffer();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        str.append(in.nextLine());
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=97 && str.charAt(i)<=122)
            {  
                str.insert(i,(char)(str.charAt(i)-32));
                str.deleteCharAt(i+1);
            }
        }
        System.out.println("String in capital letters :- "+str); 
        in.close();
        System.out.println("\n---------------------------------------------------\n");
    }    
}

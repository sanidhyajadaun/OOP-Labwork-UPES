package Lab3;

public class sumofnum {
    public static void main(String[] args)
    {
        int n = 0;
        for(int j=41;j<250;j++)
        {
            if(j%5==0)
            {
                n+=j;
            }
        }
        System.out.println("Sum of all the numbers between 40 and 250 and are divisible by 5 are : "+n);
    }        
}


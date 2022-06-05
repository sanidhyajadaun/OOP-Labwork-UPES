package Lab2;

public class pattern {
    public static void main(String args[]) 
    {
        int x=3;
        double n;
        for(double i=1;i<=x;i++)
        {
            n = Math.pow(2.0,i);
            for(int j=1;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}
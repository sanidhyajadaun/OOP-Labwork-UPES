package Lab2;

public class Calc 
{
    public static void main(String[] args)
    {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[2]);
        switch(args[1])
        {
            case "+" : System.out.println("Sum of "+x+" and "+y+" is : "+ (x+y));
                        break;
            case "-" : System.out.println("Subtraction of "+x+" and "+y+" is : "+ (x-y));
                        break;
            case "/" : System.out.println("Division of "+x+" and "+y+" is : "+ (x/y));
                        break;
            case "x" : System.out.println("Product of "+x+" and "+y+" is : "+ (x*y));
                        break;
        }
    }    
}

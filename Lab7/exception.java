package Lab7;

public class exception 
{
    public static void main(String[] args)
    {
        try
        { 
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            System.out.println("Modules of X and Y : "+(x%y));
        }    
        catch(NumberFormatException e)
        {
            System.out.println("Exception....Non numeric character entered...!!");
        }
    }
}


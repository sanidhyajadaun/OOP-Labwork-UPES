package Lab2;

class LargeInThree 
{
    public static void main(String[] args)
    {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int z=Integer.parseInt(args[2]);
        if(x>y && x>z)
        {
            System.out.println(x+" is the largest number among the three");
        }
        else if(y>x && y>z)
        {
            System.out.println(y+" is the largest number among the three");
        }
        else 
        {
            System.out.println(z+" is the largest number among the three");
        }
    }    
}



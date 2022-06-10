package Lab7;

public class myexception extends Exception 
{
    private int a;
    myexception(int a)
    {
        this.a=a;
    }

    public String toString()
    {
        return "Exception.....User Exception Generated.....!\nNumber "+this.a+" is smaller than 500!";
    }
}


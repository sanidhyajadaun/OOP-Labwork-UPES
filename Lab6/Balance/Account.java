package Balance;

public class Account 
{
    double balance;
    //constructor
    public Account(double val)
    {
        this.balance = val;
    }

    public void Display_Balance()
    {
        System.out.println("Available Balance :- "+this.balance);
    }    
}


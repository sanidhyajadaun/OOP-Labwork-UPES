package Lab4;

public class player 
{
    String Name;
    String sport;
    public player(String a)
    {
        this.Name = a;
        this.sport = "Not Assigned";
    }
    
    void namesport(String b)
    {
        this.sport = b;
    }

    void showplayerdetails()
    {
        System.out.println("Player Name :- "+this.Name);
        System.err.println("Sport Name :- "+this.sport);
    }
}


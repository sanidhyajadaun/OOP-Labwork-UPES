package Lab4;

public class Cricket_Player extends player
{
    int runscored;
    int wicketstaken;
    Cricket_Player(String a,int runscored,int wicketstaken)
    {
        super(a);
        this.sport = "Cricket";
        this.runscored = runscored;
        this.wicketstaken = wicketstaken;
    }
    void showplayerdetails()
    {
        super.showplayerdetails();
        System.out.println("Runs Scored :- "+this.runscored);
        System.out.println("Wickets Taken :- "+this.wicketstaken);
    }

}
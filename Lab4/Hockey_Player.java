package Lab4;

public class Hockey_Player extends player 
{
    String teamname;
    String ranking;
    int goalscored;

    Hockey_Player(String a,String teamname, String ranking, int goalscored)
    {
        super(a);
        this.sport = "Hockey";
        this.teamname = teamname;
        this.ranking = ranking;
        this.goalscored = goalscored;
    }

    void showplayerdetails()
    {
        super.showplayerdetails();
        System.out.println("Team Name :- "+this.teamname);
        System.out.println("Ranking :- "+this.ranking);
        System.out.println("Goals Scored :- "+this.goalscored);
    }
}

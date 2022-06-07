package Lab4;

public class Football_player extends player
{
    int goalscored;
    String clubname;
    String ranking;

    Football_player(String a,int goalscored,String clubname, String ranking)
    {
        super(a);
        this.sport = "FootBall";
        this.clubname = clubname;
        this.goalscored = goalscored;
        this.ranking = ranking;
    }
    
    void showplayerdetails()
    {
        super.showplayerdetails();
        System.out.println("Club Name :- "+this.clubname);
        System.out.println("Goals Scored :- "+this.goalscored);
        System.out.println("Ranking :- "+this.ranking);
    }
}

package Lab4;

public class sports
{
    public static void main(String[] args)
    {
        var object1 = new player("M S Dhoni");
        var object2 = new Cricket_Player("Virat Kohli", 15000, 5) ;
        var object3 = new Hockey_Player("Srijesh","India", "7", 10);
        var object4 = new Football_player("Messi", 700, "PSG", "1");

        object1.showplayerdetails();
        System.out.println();
        object2.showplayerdetails();
        System.out.println();
        object3.showplayerdetails();
        System.out.println();
        object4.showplayerdetails();
        System.out.println();
    }
}

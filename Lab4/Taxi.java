package Lab4;

public class Taxi extends automobile
{
    Taxi(int speed,String brand,String fuel)
    {
        super(speed,brand,fuel);
    }
    void showdetails()
    {
        System.out.println(speed);
        System.out.println(brand);
        System.out.println(fuel);
    }
}

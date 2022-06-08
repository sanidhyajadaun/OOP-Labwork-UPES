package Lab5;

public class Prove implements ConstVal
{
    @Override
    public void changevalue()
    {

    }

    @Override
    public void showvalue()
    {
        System.out.println("\n--------------------\n");
        System.out.println("Final Value :- "+val);
        System.out.println("\n--------------------\n");
    }
    
    public static void main(String args[])
    {
        Prove object = new Prove();
        object.changevalue();
        object.showvalue();
    }
}

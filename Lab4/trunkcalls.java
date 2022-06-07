package Lab4;

import java.util.Scanner; 
public class trunkcalls 
{
    double duration;
    String typeofcall;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int ordinary_charge = 20; 
        int urgent_charge = 10;
        int lightning_charge = 40;

        System.out.print("Enter the Duration of Ordinary Call :- ");
        double period = in.nextDouble();

        var obj_ordinary = new ordinary(period);
        System.out.print("Enter the Duration of Urgent Call :- ");
        period = in.nextDouble();
        var obj_urgent = new urgent(period);
        System.out.print("Enter the Duration of Lightning call :- ");
        period = in.nextDouble();
        var obj_lightning = new lightning(period);
        
        System.out.println();
        obj_ordinary.showdetails();
        System.out.println("Total Charge : "+obj_ordinary.ChargeCalculation(ordinary_charge)+"\n");
        obj_urgent.showdetails();
        System.out.println("Total Charge :"+obj_urgent.ChargeCalculation(urgent_charge)+"\n");
        obj_lightning.showdetails();
        System.out.println("Total charge : "+obj_lightning.ChargeCalculation(lightning_charge));
        in.close();
    }

    void showdetails()
    {
        System.out.println("Type Of Call : "+this.typeofcall);
        System.out.println("Duration of Call : "+this.duration);
    }
}

package Lab4;

import java.util.Scanner;

public class salary 
{
    public static void main(String[] args)
    {
        var in = new Scanner(System.in);
        String x;
        double r;
        int hours1 ; 

        System.out.println("*****Fill the Details of Daily Worker*****");
        System.out.print("Worker Name :- ");
        x = in.nextLine();
        System.out.print("Salary Rate :- ");
        r = in.nextDouble();
        System.out.print("Number of working hours :- ");
        hours1 = in.nextInt();

        var dailyworker = new DailyWorker(x, r);

        System.out.println("*****Fill the details of Salaried Worker*****");
        System.out.print("Worker Name :- ");
        x = in.next();
        System.out.print("Salary rate :- ");
        r = in.nextDouble();

        var salariedworker = new SalariedWorker(x, r);

        dailyworker.ShowWorkerDetails();
        System.out.println("Weekly Pay :- "+dailyworker.ComPay(hours1));

        salariedworker.ShowWorkerDetails();
        System.out.println("Weekly pay :- "+salariedworker.ComPay(60));
        in.close();
    }
}

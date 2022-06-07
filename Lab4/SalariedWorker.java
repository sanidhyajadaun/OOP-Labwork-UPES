package Lab4;

public class SalariedWorker extends worker
{
    SalariedWorker(String x,double r)
    {
        super(x, r);
    }

    @Override
    double ComPay(int hours)
    {
        System.out.println("Calculating weekly pay for salaried worker (Inside SalariedWorker class)");
        return this.salary_rate*(40/24)+(this.salary_rate/24)*16;
    }
}

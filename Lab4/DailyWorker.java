package Lab4;

public class DailyWorker extends worker
{
    DailyWorker(String x,double r)
    {
        super(x, r);
    }
    @Override
    double ComPay(int hours)
    {
        System.out.println("Calculating week pay for daily worker (Inside DailyWorker class)");
        double days = hours/24;
        int hrs = hours%24;
        double val = this.salary_rate*days + (this.salary_rate/24)*hrs;
        return val;
    }
    
}

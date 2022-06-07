package Lab4;

public abstract class worker 
{
    String name;
    double salary_rate;
    
    worker(String x, double r)
    {
        this.name = x;
        this.salary_rate = r;
    }

    void ShowWorkerDetails()
    {
        System.out.println();
        System.out.println("Worker Name :- "+this.name);
        System.out.println("Salary rate :- "+this.salary_rate);
    }

    abstract double ComPay(int hours);
}

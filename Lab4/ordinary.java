package Lab4;

public class ordinary extends trunkcalls
{
    ordinary(double dur)
    {
        this.duration=dur;
        this.typeofcall="Ordinary";
    }

    double ChargeCalculation(int charges)
    {
        return this.duration*charges;
    }

}

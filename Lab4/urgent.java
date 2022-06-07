package Lab4;

public class urgent extends trunkcalls
{
    urgent(double dur)
    {
        this.duration=dur;
        this.typeofcall="Urgent";
    }

    double ChargeCalculation(int charges)
    {
        return this.duration*charges;
    }
}


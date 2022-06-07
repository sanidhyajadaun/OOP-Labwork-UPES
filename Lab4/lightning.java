package Lab4;

public class lightning extends trunkcalls
{
    lightning(double dur)
    {
        this.duration=dur;
        this.typeofcall="Lightning";
    }

    double ChargeCalculation(int charges)
    {
        return this.duration*charges;
    }
}


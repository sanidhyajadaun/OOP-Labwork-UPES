package mathematic;


public class Exponential     
{
    public double Exp(int k)    //to find the exponent
    {
        double value=1;
        for(int i=0;i<k;i++)
        {
            value*=2.71;
        }
        return value;
    }
}

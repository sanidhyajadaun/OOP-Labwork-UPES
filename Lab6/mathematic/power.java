

package mathematic;

public class power
{
    public int pow(int x,int y)   //to find the power
    {
        int value=1;
        for(int i=0;i<y;i++)
        {
            value*=x;
        }
        return value;
    }
}

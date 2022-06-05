package Lab2;

public class Studentmarks 
{
    public static void main(String[] args)
    {
        int array[]= new int[10];
        for(int x=0;x<10;x++)
        {
            array[x]=Integer.parseInt(args[x]);
        }
        int n= array.length;
        int temp = 0;  
        for(int x=0; x < n; x++)
        {  
            for(int y=1; y < (n-x); y++)
            {  
                if(array[y-1] > array[y])
                {  
                    //swap elements  
                    temp = array[y-1];  
                    array[y-1] = array[y];  
                    array[y] = temp;  
                } 
            }
        }
        for(int i=0;i<10;i++)
        {
            if(array[i]>=40 && array[i]<=50)
            {
                System.out.println(array[i]+" Pass");
            }
            else if(array[i]>=51 && array[i]<=75)
            {
                System.out.println(array[i]+" Merit");
            }
            else if(array[i]>75)
            {
                System.out.println(array[i]+" Distinction");
            }
            else 
            {
                System.out.println(array[i]+" Fail");
            }
        }
    }    
}


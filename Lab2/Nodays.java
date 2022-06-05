package Lab2;

public class Nodays {
    public static void main(String[] args)
    {
        int day=1,month=1,year=1970;
        int dd = Integer.parseInt(args[0]);
        int mm=Integer.parseInt(args[1]);
        int yyyy= Integer.parseInt(args[2]);
        int x1= 365*yyyy + yyyy/4 - yyyy/100 + yyyy/400 + dd + (153*mm+8)/5;
        int x2 =365*year + year/4 - year/100 + year/400 + day + (153*month+8)/5;
        System.out.println("Number of days between 01/01/1970 and "+dd+"/"+mm+"/"+yyyy+" are : "+ (x1-x2));        
    }
}


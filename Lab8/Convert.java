package Lab8;

public class Convert 
{
    public static void main(String[] args)
    {
        System.out.println("\n---------------------------------------------------\n");
        int a = 5;  //int variable a
        System.out.println("Value of a (int) :- "+ a);
        //converting int to Integer
        Integer A = a;   
        System.out.println("Value of A (int to Integer) :- "+A); 
        //converting Integer to String
        String S = A.toString();       
        System.out.println("Value of S (Integer to String) :- "+S);
        //converting String to int
        int b = Integer.parseInt(S);
        System.out.println("Value of b(String to int) :- "+b);
        int c = 10;
        //converting int to String
        String str = Integer.toString(c);
        System.out.println("Value of str (int to String) : "+str);
        //converting String to Integer
        Integer B = Integer.valueOf(str);
        System.out.println("Value of B (String to Integer) : "+B);
        //converting Integer to int
        int d = B; //unboxing Integer to int 
        System.out.println("Value of d (Integer to int) : "+d);
        System.out.println("\n---------------------------------------------------\n");
    }    

    
}

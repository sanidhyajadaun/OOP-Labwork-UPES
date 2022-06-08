package Lab5;

public class MyClass implements A
{
    @Override    
    public void meth1()
    {
        System.out.println("\n-----------------------------------------------------------------------\n ");
        System.out.println("From method meth1() and meth1() of interface A is implemented by MyClass ");
    }   
    
    @Override    
    public void meth2()
    {
        System.out.println("From method meth2() and meth2() of interface A is implemented by MyClass");
        System.out.println("\n-----------------------------------------------------------------------\n ");
    }

    public static void main(String[] args)
    {
        MyClass object = new MyClass();   
        object.meth1();     
        object.meth2();    
    }
}


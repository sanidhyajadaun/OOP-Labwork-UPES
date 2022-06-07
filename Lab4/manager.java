package Lab4;

public class manager extends employee
{
    String department;  
    manager(String name,int empid,double salary,String department)  
    {
        super(name, empid, salary);    
        this.department=department;
    }
}


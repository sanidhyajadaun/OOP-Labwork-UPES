package Lab4;

public class employee 
{
    String name;
    int empid;
    double salary;

    employee()
    {
        name = "";
        empid = 0;
        salary = 0.0;
    }

    employee(String name,int empid,double salary)   //parameterised constructor 
    {
        this.name=name;
        this.empid=empid;
        this.salary=salary;
    }

    String getName()         //method to return name of the employee
    {
        return this.name;
    }

    double getSalary()       
    {
        return this.salary;
    }

    void increaseSalary(double num)    
    {
        double temp = this.salary*(num/100);
        this.salary=this.salary+temp;
    }
}


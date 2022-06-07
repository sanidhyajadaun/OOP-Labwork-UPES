package Lab4;

public class organization 
{
    public static void main(String[] args)
    {
        var object = new employee("Rohit Gupta",55,67_000);  
        var object2 = new manager("Ashish Suraj",2,85_000,"HR");  

        System.out.println("Employee Name :- "+object.getName());
        
        System.out.println("Salary : "+object.getSalary());
        object.increaseSalary(20);
        
        System.out.println("Salary After Increment :- "+object.getSalary());

        
        System.out.println("\nName of the manager :- "+object2.getName());
         
        System.out.println("Department :- "+object2.department);
        
        System.out.println("Salary :- "+object2.getSalary());
        object2.increaseSalary(30);
       
        System.out.println("Salary after increment :- "+object2.getSalary());
    }    

    
}

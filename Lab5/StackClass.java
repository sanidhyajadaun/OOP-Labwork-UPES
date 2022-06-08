package Lab5;

import java.util.Scanner ;
public class StackClass implements StackInterface
{
    int[] stack = new int[20];    
    int top = -1;  

    @Override     
    public void push(int x)      
    {
        if(this.top==stack.length-1)    
        {
            System.out.println("Overflow.....!");
        }
        else
        {
            top++;
            stack[top]=x;    
        } 
    }


    @Override   
    public void pop()           
    {
        if(top==-1)       
        {
            System.out.println("\nUnderflow......!");
        }
        else
        {
            System.out.println("\n"+stack[top]+" is popped out from the stack....!\n");
            top--;     
        } 
    }
    @Override   
    public void display()      
    {
        if(top==-1)     
        {
            System.out.println("\nStack is empty....!");
        }
        else 
        {
            int i=top;
            System.out.println("\nStack elements are :- ");
            //displaying the elements 
            for(;i>=0;i--)
            {
                System.out.println(stack[i]);
            } 
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean check = true;
        StackClass object = new StackClass();  

        while(check==true)
        {
            System.out.println("\n-----------------------------------------------------\n");
            System.out.println("Choose any Stack operation :- ");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.print("Enter your choice :- ");
            int temp = in.nextInt();

            switch(temp)
            {
                case 1 : 
                        {
                            System.out.print("\nEnter the value you want to push in the stack :- ");
                            int x = in.nextInt();
                            object.push(x);
                            break;
                        }
                case 2 : 
                        object.pop();
                        break;
                case 3 : 
                        object.display();
                        break;
                default : System.out.println("Invalid Choice...!");
            }
            System.out.print("Do you want to perform more stack operations ? (true/false) :- ");
            check = in.nextBoolean();
        }
        in.close();
        System.out.println("\n-----------------------------------------------------\n");
    }
}





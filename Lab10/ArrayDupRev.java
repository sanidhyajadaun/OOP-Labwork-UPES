package Lab10;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayDupRev 
{
    public static void main(String[] args)
    {
        System.out.println("\n----------------------------------------------------------\n");
        ArrayList<Integer> L = new ArrayList<>();
        L.add(7);
        L.add(15);
        L.add(20);
        Iterator<Integer> iterate = L.iterator();
        //1. reading the elements through the iterator 

        System.out.println("Elements in the Array list are :- ");
        while(iterate.hasNext())
        {
            System.out.println(iterate.next());
        }
        //2. Create duplicate object of an ArrayList instance

        @SuppressWarnings("unchecked")
        ArrayList<Integer> duplicate = (ArrayList<Integer>)(L.clone());  //(ArrayList<Integer>) L.clone();
        System.out.println("Duplicate of ArrayList Instance :- "+duplicate);

        //3. reverse the Array List 
        ArrayList<Integer> rev = new ArrayList<>();
        for (int i = L.size() - 1; i >= 0; i--) 
        {
            // Append the elements in reverse order
            rev.add(L.get(i));
        }
        System.out.println("Reversed Array List :- "+rev);
        System.out.println("\n----------------------------------------------------------\n");
        
    }
}

    
package Lab10;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner; 


public class HashMap 
{
    public static void main(String[] args)
    {
        System.out.println("\n----------------------------------------------------------\n");
        Scanner in = new Scanner(System.in);
        //creating a ArrayList 
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Sanidhya");
        arr.add("Rohit");
        arr.add("Ashish");
        arr.add("Suraj");
        arr.add("Rohit");
        arr.add("Sanidhya");

        //displaying the elementments of the ArrayList
        System.out.println("Array List :- "+arr);

        //1. copying another collection(ArrayList) object to HashSet object.
        HashSet<String> obj = new HashSet<>(arr);
        //displaying the elementments of the HashSet
        System.out.println("Hash Set :- "+obj);

        //2. delementte all entries at one call from HashSet
        obj.removeAll(obj);
        System.out.println("After removing all elementments, Hash Set :- "+obj);

        //3. search user defined objects from HashSet

        //adding some objects in the HashSet 
        obj.add("My");
        obj.add("name");
        obj.add("is");
        obj.add("Sanidhya");
        obj.add("Jadaun");
        System.out.println("After adding some elementments, HashSet : "+obj);
        System.out.print("Enter the object you want to search in the Hash Set : ");
        String element = in.next();

        if(obj.contains(element))
        {
            System.out.println("Hash Set contains '"+element+"'");
        }
        else 
        {
            System.out.println("Hash Set do not contain '"+element+"'");
        }

        in.close();
        System.out.println("\n----------------------------------------------------------\n");
    }
}

    
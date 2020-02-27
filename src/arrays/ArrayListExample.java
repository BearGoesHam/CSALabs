package arrays;

import java.util.ArrayList;

public class ArrayListExample
{

    public static void main(String[] args)
    {
        ArrayList<String> classmates = new ArrayList<String>();

        System.out.println(classmates.size());
        classmates.add("Faateh");
        classmates.add("Justin");
        classmates.add("Mike");
        classmates.add("Lorenzo");
        System.out.println(classmates.size());

        for(int i = 0; i < classmates.size(); i++)
        {
            System.out.println(classmates.get(i));
        }
        
    }

}

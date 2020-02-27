package arrays;

import java.util.ArrayList;
import java.util.List;

public class ListClasses
{

    public static void main(String[] args)
    {
        List<String> classes = new ArrayList<String>();

        classes.add("Math");
        classes.add("Science");
        classes.add("History");
        classes.add("Study");
        classes.add("Elective");
        classes.add("Spanish");
        classes.add("Free Period");

        System.out.println(classes.get(6));

        classes.set(6, "Computer Science");
        classes.add(1, "AP Government");
        classes.remove(3);

        System.out.println("Total Classes: ");

        for(int i = 0; i < classes.size(); i++)
        {
            System.out.println("Class: " + classes.get(i));
        }

    }

}

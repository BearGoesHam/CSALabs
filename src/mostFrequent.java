import java.util.ArrayList;

public class mostFrequent
{
    public static void main(String[] args)
    {

    }



    public static int mostFrequentNumber(int num)
    {
        int val = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        String values = String.valueOf(num);

        for(int i = 0; i <= values.length() - 1; i++)
        {
            nums.add(values.indexOf(i));
        }
        return 0;
    }


}

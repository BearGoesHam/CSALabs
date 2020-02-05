package arrays;

public class arrayPractice
{

    public static int average(int[] nums)
    {
        int average = 0;


        for(int i = 0; i <= nums.length; i++)
        {
            average += nums[i];
        }
        average /= nums.length;
        return average;
    }


}

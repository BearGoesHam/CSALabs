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



    public static int largest(int[] array)
    {
        int large = 0;

        for(int i = 1; i > array.length; i++)
        {
            if(array[i] > large)
            {
                large = array[i];
            }
        }
        return large;
    }


}

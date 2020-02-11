package arrays;

public class reversingArrays
{
    public static void main(String[] args)
    {
        int[] numbers = {11,42,-5,27,0,89};


    }

    public static int[] flip(int[] nums)
    {
        for(int i = 0; i < nums.length / 2; i++)
        {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;

        }
        return nums;
    }


}

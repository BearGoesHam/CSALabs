import java.util.Scanner;

public class FizzBuzz
{
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args)
    {
        String fizz = "fizz";
        String buzz = "buzz";

        int count;

        for(int i= 1; i <= 100; i++)
        {
            if(i % 15 == 0)
            {
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0)
            {
                System.out.println("Fizz");
            }else if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }else
                {
                System.out.println(i);
            }
        }


    }

}

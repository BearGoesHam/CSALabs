package pennies;

public class pennies
{
    private static double pennies;
    private static double days;

    public pennies(double pennyam, double days)
    {
        this.pennies = pennyam;
        this.days = days;
    }

    public void math()
    {
        for(int i = 1; i < this.days; i++)
        {
            System.out.println(pennies);
            pennies = pennies * 2.0;
        }
        }
    }

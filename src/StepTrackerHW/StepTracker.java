package StepTrackerHW;

public class StepTracker
{
    //Amount of days active
    private int activeDays;
    //minimum steps to count as an active day
    private int activeSteps;
    //Steps amount variable
    private int dailySteps;
    //number of days steps have been added
    private int dayCount;


    public StepTracker(int active)
    {
        this.activeSteps = active;
    }

    public void addDailySteps(int steps)
    {
        if(steps >= this.activeSteps)
        {
            dailySteps += steps;
            activeDays++;
            dayCount++;
        }else
        {
            dailySteps += steps;
            dayCount++;
        }
    }
    public int getActiveDays()
    {return this.activeDays;}

    public double getAverageSteps()
        { return (double) (dailySteps / dayCount);}
}

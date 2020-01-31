package StepTrackerHW;

public class StepMain
{
    public static void main(String[] args)
    {
        StepTracker tr = new StepTracker(10000);
        System.out.println("0");
        System.out.println("0");
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.getActiveDays());
        System.out.println(tr.getAverageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.getActiveDays());
        System.out.println(tr.getAverageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.getActiveDays());
        System.out.println(tr.getAverageSteps());
    }
}

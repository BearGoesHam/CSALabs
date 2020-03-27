package enrichment;

public class FrogSimulation
{


    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int hopCount)
    {
        goalDistance = dist;
        maxHops = hopCount;
    }

    private int hopDistance()
    {
        return goalDistance;
    }

    public boolean simulate()
    {

        int result = 0;

        for(int i = 0; i < maxHops; i++)
        {
            result += hopDistance();
        }

        return (goalDistance <= result);
    }

    public double runSimulations(int num)
    {
        double correct = 0.0;

        for(int i = 0; i < num; i++)
        {
            simulate();
            if(simulate() == true)
            {
                correct++;
            }
        }
        return (correct / num);
    }



}

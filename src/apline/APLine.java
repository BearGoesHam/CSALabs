package apline;

public class APLine
{
    private int a;
    private int b;
    private int c;

    public APLine(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //Calculates the line
    public double getSlope()
    {
        return -(double) a / b;
    }

    //X and Y are the coords of point
    public boolean isOnLine(int x, int y)
    {
        boolean val = false;
        if((this.a * x + this.b * y) + this.c == 0)
        {
            val = true;
        }
        return val;
    }
}

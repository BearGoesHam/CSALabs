package ClassesLab;

public class Circle
{
    private int x;
    private int y;
    private double radius;

    public Circle()
    {
        this.x = 0;
        this.y = 0;
        this.radius = 2.0;
    }
    public Circle(int x, int y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getArea()
    {
        return 3.14 * (this.radius * this.radius);
    }
    public void translate(int dx, int dy)
    {
        this.x += dx;
        this.y += dy;
    }

    public double tripleTheRadius()
    {
        return this.radius * 3;
    }

    public void print()
    {
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println(this.radius);
    }


}

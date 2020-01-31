package ClassesLab;

public class Main
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(1, 1, 10.0);

        circle1.translate(3,3);
        circle1.print();

        circle2.tripleTheRadius();
        System.out.println(circle2.getArea());
        circle2.print();
    }



}

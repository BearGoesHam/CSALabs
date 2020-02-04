package DataDataData;

public class CerealMain
{

    public static void main(String[] args)
    {
        Cereal cheerios = new Cereal("Cherrios", "C", 5,6,8,9,7,3,4,6,7,6,10, 2, 63);
        Cereal toastcrunch = new Cereal("Toast Crunch", "C", 50, 40, 50, 143,25,346,468,59,345,5,6,2,50);

        System.out.print(cheerios.toString());
        System.out.print("\n--------------------------------\n");
        System.out.print(toastcrunch.toString());

    }

}

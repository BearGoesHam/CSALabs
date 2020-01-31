public class Bankuser
{

    public static void main(String[] args)
    {
        BankAccount faateh = new BankAccount();
        BankAccount mike = new BankAccount("Mike Youseff", 12.50);

        mike.printInfo();
        faateh.printInfo();

        mike.deposit(5007.5);
        mike.withdraw(5020.0);
        faateh.withdraw(20.0);

    }

}

public class BankAccount
{
    public String accHolder;
    private int accNumber;
    private static int numAccounts;
    private double balance;


    public BankAccount()
    {
        this.accHolder = "";
        this.accNumber += 1;
        numAccounts += 1;
        this.balance = 0.0;
    }

    public BankAccount(String holder, double balance)
    {
        this.accHolder = holder;
        this.accNumber += 1;
        this.balance = balance;
        numAccounts += 1;
    }


    public void printInfo()
    {
        System.out.println( "Holder: " + this.accHolder + "\n" + "Account Number: " + this.accNumber + "\n" + "Balance: " + this.balance + "\n" + "Total Number Of Accounts: " + numAccounts + "\n");
    }
    public void withdraw(double amount)
    {
        if(this.balance >= amount)
        {
            this.balance -= amount;
            System.out.println("You withdrew " + amount + "! New Balance: " + this.balance + "\n");
        }else
        {
            System.out.println("Error. Not Enough Funds.\n");
        }
    }

    public void deposit(double amount)
    {
        this.balance += amount;

        System.out.println("You deposited " + amount + "! New Balance: " + this.balance);

    }
}

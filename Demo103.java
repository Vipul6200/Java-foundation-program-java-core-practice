import java.util.Scanner;
class Bank
{
    String name;
    int accNo;
    double balance;
    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        System.out.print("Enter Account Number: ");
        System.out.print("Enter Initial Balance: ");
        name = s1.next();
        accNo = s1.nextInt();
        balance = s1.nextDouble();
    }
    public void Deposit(double amt)
    {
        balance += amt;
    }
    public void Withdraw(double amt)
    {
        if(amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient Balance");
    }

    public void ShowAll()
    {
        System.out.println("Name : " + name);
        System.out.println("Account No : " + accNo);
        System.out.println("Balance : " + balance);
    }
}

public class Demo103
{
    public static void main(String args[])
    {
        Bank b = new Bank();
        b.GetData();
        b.Deposit(2000);
        b.Withdraw(1000);
        b.ShowAll();
    }
}
   

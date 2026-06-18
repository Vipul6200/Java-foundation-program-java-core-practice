import java.util.Scanner;
class Demo102
{
    public static void main(String args[])
    {
        int choice;
        double balance = 1000;
        double amount;
        Scanner s1 = new Scanner(System.in);

        do
        {
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.print("Enter Choice: ");
            choice = s1.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter Amount: ");
                    amount = s1.nextDouble();
                    balance += amount;
                    System.out.println("Balance = " + balance);
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    amount = s1.nextDouble();

                    if(amount <= balance)
                    {
                        balance -= amount;
                        System.out.println("Balance = " + balance);
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 3:
                    System.out.println("Current Balance = " + balance);
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while(choice != 4);
    }
}
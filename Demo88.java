import java.util.Scanner;
class BusPass
{
    String name;
    int busNo;
    int fee;

    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        System.out.println("Enter Bus Number:");
        System.out.println("Enter Monthly Fee:");
        name = s1.next();
        busNo = s1.nextInt();
        fee = s1.nextInt();
    }

    public void ShowAll()
    {
        System.out.println("Student Name : " + name);
        System.out.println("Bus Number : " + busNo);
        System.out.println("Monthly Fee : " + fee);
    }
}
public class Demo88
{
   public static void main(String args[])
    {
        BusPass b = new BusPass();
        b.GetData();
        b.ShowAll();
    }

}
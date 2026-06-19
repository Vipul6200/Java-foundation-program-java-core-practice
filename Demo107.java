import java.util.Scanner;
class Railway
{
    String passengerName; 
    String source; 
    String destination;

    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Passenger Name: ");
        System.out.print("Enter Source: ");
        System.out.print("Enter Destination: ");
        passengerName = s1.next();
        source = s1.next();
        destination = s1.next();
    }

    public void ShowAll()
    {
        System.out.println("Passenger : " + passengerName);
        System.out.println("Source : " + source);
        System.out.println("Destination : " + destination);
    }
}

public class Demo107
{
    public static void main(String args[])
    {
        Railway r = new Railway();
        r.GetData();
        r.ShowAll();
    }
}
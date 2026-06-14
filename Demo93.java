import java.util.Scanner;
class Attendance
{
    String name;
    int totaldays;
    int presentdays;
    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the name of the student");
        System.out.println("enter the total days");
        System.out.println("enter the present days");
        name = s1.next();
        totaldays = s1.nextInt();
        presentdays = s1.nextInt();
    }
    public void Calculate()
    {
        double percentage = (presentdays * 100) / totaldays;
    }
    public void ShowAll()
    {
        System.out.println("name of the student is " + name);
        System.out.println("total days " + totaldays);
        System.out.println("present days " + presentdays);
    }
}
public class Demo93
{
    public static void main(String[] args)
    {
        Attendance a = new Attendance();
        a.GetData();
        a.Calculate();
        a.ShowAll();
    }
}
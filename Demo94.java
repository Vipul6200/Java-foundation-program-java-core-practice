import java.util.Scanner;
class Planner
{
    String task1;
    String task2;
    int hour1;
    int hour2;

    public void getData()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter First Task:");
        System.out.println("Enter Hours:");
        System.out.println("Enter Second Task:");
        System.out.println("Enter Hours:");
        task1 = s1.next();
        hour1 = s1.nextInt();
        task2 = s1.next();
        hour2 = s1.nextInt();
    }

    public void ShowAll()
    {
        System.out.println(task1 + " : " + hour1);
        System.out.println(task2 + " : " + hour2);
    }
}
public class Demo94
{
    public static void main(String[] args)
    {
        Planner p1 = new Planner();
        p1.getData();
        p1.ShowAll();
    }
}

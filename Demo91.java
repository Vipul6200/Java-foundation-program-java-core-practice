import java.util.Scanner;
class EmployeeTime
{
    String empName; 
    String task;
    int hours;

    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        System.out.println("Enter Task Name:");
        System.out.println("Enter Working Hours:");
        empName = s1.next();
        task = s1.next();
        hours = s1.nextInt();
    }
    public void ShowAll()
    {
        System.out.println("Employee Name : " + empName);
        System.out.println("Task : " + task);
        System.out.println("Working Hours : " + hours);
    }
}
public class Demo91
{
    public static void main(String args[])
    {
        EmployeeTime e = new EmployeeTime();
        e.GetData();
        e.ShowAll();
    }
}
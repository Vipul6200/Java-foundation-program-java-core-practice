import java.util.Scanner;
class TimeTable
{
    String studentName;
    String subject;
    String time;
    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter student name:");
        System.out.println("Enter subject:");
        System.out.println("Enter time:");
        studentName = s1.next();
        subject = s1.next();
        time = s1.next();
    }
    public void ShowAll()
    {
        System.out.println("Student Name:" + studentName);
        System.out.println("Subject:" + subject);
        System.out.println("Time:" + time);
    }
}
public class Demo92
{
    public static void main(String[] args)
    {
        TimeTable t1 = new TimeTable();
        t1.GetData();
        t1.ShowAll();
    }
}
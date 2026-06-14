import java.util.Scanner;
class EventRegistration
{
    String studentName; 
    String eventName; 
    String department;

    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        System.out.println("Enter Event Name:");
        System.out.println("Enter Department:");
        studentName = s1.next();
        eventName = s1.next();
        department = s1.next();
    }

    public void ShowAll()
    {
        System.out.println("Student Name : " + studentName);
        System.out.println("Event Name : " + eventName);
        System.out.println("Department : " + department);
    }
}
public class Demo89
{
  public static void main(String args[])
    {
        EventRegistration e = new EventRegistration();

        e.GetData();
        e.ShowAll();
    }

}
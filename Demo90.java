import java.util.Scanner;
class Assignment
{
    String studentName; 
    String subject; 
    String date;

    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        System.out.println("Enter Subject Name:");
        System.out.println("Enter Submission Date:");
        studentName = s1.next();
        subject = s1.next();
        date = s1.next();
    }

    public void ShowAll()
    {
        System.out.println("Student Name : " + studentName);
        System.out.println("Subject : " + subject);
        System.out.println("Submission Date : " + date);
    }
}
public class Demo90
{
  public static void main(String args[])
    {
        Assignment a = new Assignment();
        a.GetData();
        a.ShowAll();
    }
}

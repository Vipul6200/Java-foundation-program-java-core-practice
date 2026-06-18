import java.util.Scanner;
class Student
{
    int roll;
    String name;
    String course;
    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        System.out.print("Enter Name: ");
        System.out.print("Enter Course: ");
        roll = s1.nextInt();
        name = s1.next();
        course = s1.next();
    }

    public void ShowAll()
    {
        System.out.println("Roll No : " + roll);
        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
    }
}

public class Demo104
{
   public static void main(String args[])
    {
        Student s = new Student();
        s.GetData();
        s.ShowAll();
    }

}
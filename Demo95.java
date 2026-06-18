import java.util.Scanner;
class Marks
{
    String name;
    int m1, m2, m3;
    int total;
    double per;

    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        System.out.println("Enter 3 Subject Marks:");
        name = s1.next();
        m1 = s1.nextInt();
        m2 = s1.nextInt();
        m3 = s1.nextInt();
    }

    public void Calculate()
    {
        total = m1 + m2 + m3;
        per = total / 3;
    }

    public void ShowAll()
    {
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + per);

        if(per >= 60)
        {
            System.out.println("Grade : First");
        }
        else
        {
            System.out.println("Grade : Second");
        }
    }
}
public class Demo95
{
    public static void main(String args[])
    {
        Marks m = new Marks();
        m.GetData();
        m.Calculate();
        m.ShowAll();
    }
}
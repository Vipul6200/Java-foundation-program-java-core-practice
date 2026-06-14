import java.util.Scanner;
class StudyTracker
{
    String name;
    int h1, h2, h3, h4, h5, total;
    public void GetData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        System.out.println("Enter Study Hours for 5 Days:");
        name = sc.next();
        h1 = sc.nextInt();
        h2 = sc.nextInt();
        h3 = sc.nextInt();
        h4 = sc.nextInt();
        h5 = sc.nextInt();
    }

    public void calculate()
    {
        total = h1 + h2 + h3 + h4 + h5;
    }

    public void ShowAll()
    {
        System.out.println("Student Name : " + name);
        System.out.println("Total Study Hours : " + total);
    }

}
public class Demo87
{
    public static void main(String args[])
    {
        StudyTracker s = new StudyTracker();
        s.GetData();
        s.calculate();
        s.ShowAll();
    }
}
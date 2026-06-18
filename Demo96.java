import java.util.Scanner;
class Library
{
    String studentName;
    String bookName;
    int days;
    int fine;

    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        System.out.println("Enter Book Name:");
        System.out.println("Enter Late Days:");
        System.out.println("enter fine");
        studentName = s1.next();
        bookName = s1.next();
        days = s1.nextInt();
        fine = s1.nextInt();

    }

    public void Calculate()
    {
        fine = days * 5;
    }

    public void ShowAll()
    {
        System.out.println("Student Name : " + studentName);
        System.out.println("Book Name : " + bookName);
        System.out.println("Late Days : " + days);
        System.out.println("Fine : " + fine);
    }

}
public class Demo96
{
   public static void main(String args[])
    {
        Library l = new Library();
        l.GetData();
        l.Calculate();
        l.ShowAll();
    }
}

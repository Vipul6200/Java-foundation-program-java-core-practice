import Java.util.Scanner;
interface Result
{
    void calculate();
}
class Student
{
    int rollno;
    String name;
    int mark[] = new int[3];
    public Student(int r, String n, int m[])
    {
        rollno = r;
        name = n;

        for (i = 0;i < 3; i++)
        {
            marks[i] = m[i];
        }
    }
}
class Grade extends Student implements Result
{
    int total = 0;
    double per;
    Grade(int r, String n, int m[])
    {
        super(r,n,m);
    }
    public void calculate()
    {
        for (i= 0; i<3; i++)
        {
            total = total + marks[i];
        }
        per = total/3;
        System.out.println("....Student Details...");
        System.out.println("Roll No = "+ rollno);
        System.out.println("Name = " + name);
        System.out.println("Marks are: ");
        for(i=0; i < 3; i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("Total = " + total);
        System.out.println("Percentage = "+ per);

        if(per >= 75)
        {
            System.out.println("Grade = A");
        }
        else if(per >= 60)
        {
            System.out.println("Grade = B");
        }
        else if(per >= 40)
        {
            System.out.println("Grade = c");
        }
        else
        {
            System.out.println("Fail");
        }
    }
        
}
public class Demo001
{
    public static void main(String[] ars)
    {
        int m[] = new int[3];
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the rollno");
        System.out.println("enter the name");
        System.out.println("enter the three subjects ");
        r = s1.nextInt();
        n = s1.next();
        for(i = 0; i<= 3; i++)
        {
            m[i] = s1.nextInt();
        }
        Grade g = new Grade(r,n,m);
    }
}
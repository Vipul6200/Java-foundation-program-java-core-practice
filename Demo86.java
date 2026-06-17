class Student 
{
    int rollno;
    String name;
    public void Student(int rollno, String name)
    {
        System.out.println("parameterized constructor");
        rollno = r;
        name = n;
    }
    public void Show()
    {
        System.out.println("Roll No = " + rollno);
        System.out.println("Name = " + name);   
    }
}
public class Demo86
{
    public static void main(String[] args)
    {
        Student s1 = new Student(101, "John");
        s1.Show();
    }
}
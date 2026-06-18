import java.util.Scanner;
class Rectangle
{
    int length;
    int breadth;
    int area;
    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the length of the rectangle:");
        System.out.println("enter the breadth of rectangle:");
        length = s1.nextInt();
        breadth = s1.nextInt();
    }
    public void Calculate()
    {
        area = length * breadth;
    }
    public void ShowData()
    {
        System.out.println("Area of the rectangle = " + area);
    }
}
public class Demo81
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.GetData();
        r1.Calculate();
        r1.ShowData();
    }
}
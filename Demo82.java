class Rectagle
{
    int length;
    int breadth;
    int area;
    public Rectagle(int length, int breadth)
    {
        System.out.println("Rectangle is a constructor");
        length = 10;
        breadth = 20;
    }
    public void Calculate()
    {
        area = length * breadth;
    }
    public void ShowRectangle()
    {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + area);
    }
}
public class Demo82
{
    public static void main(String[] args)
    {
        Rectagle r1 = new Rectagle(10, 20);
        r1.Calculate();
        r1.ShowRectangle();
    }
}
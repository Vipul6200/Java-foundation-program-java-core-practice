class Addition
{
    int a;
    int b;
    int sum;
    public Addition(int a, int b)
    {
        sum = a+b;
        System.out.println("Addition is a parameterized constructor");
        a = 50;
        b = 600;
    }
    public void ShowAddition()
    {
        System.out.println("Sum = " + sum);
    }
}
public class Demo85
{
    public static void main(String[] args)
    {
        Addition a1 = new Addition(50, 600);
        a1.ShowAddition();
    }
}
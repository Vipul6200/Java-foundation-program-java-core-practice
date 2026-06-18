class Addition
{
    int a;
    int b;
    int sum;
    public Addition(int a, int b)
    {
        sum = a+b;
        System.out.println("Addition is a constructor");
        a = 20;
        b = 30;
    }
    public void ShowAddition()
    {
        System.out.println("Sum = " + sum);
    }
}
public class Demo84
{
    public static void main(String[] args)
    {
        Addition a1 = new Addition(10, 20);
        a1.ShowAddition();
    }
}
import java.util.Scanner;
class Inventory
{
    String productName;
    int qty;
    double price, total;

    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        System.out.print("Enter Quantity: ");
        System.out.print("Enter Price: ");
        productName = s1.next();
        qty = s1.nextInt();
        price = s1.nextDouble();
    }

    public void Calculate()
    {
        total = qty * price;
    }

    public void ShowAll()
    {
        System.out.println("Product : " + productName);
        System.out.println("Total Stock Value : " + total);
    }
}
public class Demo109
{

    public static void main(String args[])
    {
        Inventory i = new Inventory();
        i.GetData();
        i.Calculate();
        i.ShowAll();
    }
}
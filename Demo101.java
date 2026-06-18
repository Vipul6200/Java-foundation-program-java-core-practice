import java.util.Scanner;
class Demo101
{
    public static void main(String args[])
    {
        String item;
        int qty;
        double price, total;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Food Item:");
        System.out.println("Enter Quantity:");
        System.out.println("Enter Price:");
        item = s1.next();
        qty = s1.nextInt();
        price = s1.nextDouble();

        total = qty * price;

        System.out.println("Food Item : " + item);
        System.out.println("Total Bill : " + total);
    }
}
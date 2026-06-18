import java.util.Scanner;
class Demo97
{
    public static void main(String args[])
    {
        String name;
        double per;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        System.out.println("Enter Percentage:");
        name = s1.next();
        per = s1.nextDouble();

        if(per >= 60)
        {
            System.out.println(name + " is Eligible for Placement");
        }
        else
        {
            System.out.println(name + " is Not Eligible for Placement");
        }
    }
}
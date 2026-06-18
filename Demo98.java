import java.util.Scanner;
class Demo98
{
    public static void main(String args[])
    {
        String Name;
        double per;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        System.out.println("Enter Percentage:");
        Name = s1.next();
        per = s1.nextDouble();
        if(per >= 80)
        {
            System.out.println("Scholarship Approved");
        }
        else
        {
            System.out.println("Scholarship Not Approved");
        }
    }
}
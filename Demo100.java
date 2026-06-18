import java.util.Scanner;
class Demo100
{
    public static void main(String args[])
    {
        String name;
        String company;
        int duration;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        System.out.println("Enter Company Name:");
        System.out.println("Enter Duration (Months):");
        name = s1.next();
        company = s1.next();
        duration = s1.nextInt();

        System.out.println("Student Name : " + name);
        System.out.println("Company : " + company);
        System.out.println("Duration : " + duration + " Months");
    }
}
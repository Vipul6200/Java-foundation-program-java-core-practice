import java.util.Scanner;
class Demo99
{
    public static void main(String args[])
    {
        String name;
        String project; 
        String status;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        System.out.println("Enter Project Title:");
        System.out.println("Enter Status:");
        name = s1.next();
        project = s1.next();
        status = s1.next();

        System.out.println("Student Name : " + name);
        System.out.println("Project : " + project);
        System.out.println("Status : " + status);
    }
}
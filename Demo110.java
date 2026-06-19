import java.util.Scanner;
class Employee
{
    int empId;
    String empName;
    void GetEmployee()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        System.out.print("Enter Employee Name: ");
        empId = s1.nextInt();
        empName = s1.next();
    }
}

class Manager extends Employee
{
    String department;
    public void GetManager()
    {
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter Department: ");
        department = s2.next();
    }

    public void ShowAll()
    {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Department : " + department);
    }
}
public class Demo110
{
    public static void main(String args[])
    {
        Manager m = new Manager();
        m.GetEmployee();
        m.GetManager();
        m.ShowAll();
    }
}
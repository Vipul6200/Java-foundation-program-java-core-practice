import java.util.Scanner;

class Payroll
{
    String empName;
    double basic, hra, da, salary;

    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        System.out.print("Enter Basic Salary: ");
        empName = s1.next();
        basic = s1.nextDouble();
    }

    public void Calculate()
    {
        hra = basic * 0.10;
        da = basic * 0.20;
        salary = basic + hra + da;
    }

    public void ShowAll()
    {
        System.out.println("Employee : " + empName);
        System.out.println("Net Salary : " + salary);
    }
}
public class Demo108
{
    public static void main(String args[])
    {
        Payroll p = new Payroll();
        p.GetData();
        p.Calculate();
        p.ShowAll();
    }
}
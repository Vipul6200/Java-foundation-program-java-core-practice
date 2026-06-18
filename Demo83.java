class Employee
{
    int id;
    int salary;
    public Employee(int id, int salary)
    {
        System.out.println("Employee is constructor");
        id = 100;
        salary = 50000;
    }
    public void ShowEmployee()
    {
        System.out.println("Employee id = " + id);
        System.out.println("Employee salary = " + salary);
    }
}
public class Demo83
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(100, 50000);
        e1.ShowEmployee();
    }
}
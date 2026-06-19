import java.util.Scanner;
class Hospital
{
    String patientName; 
    String disease;
    String  doctorName;

    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Patient Name: ");
        System.out.print("Enter Disease: ");
        System.out.print("Enter Doctor Name: ");
        patientName = s1.next();
        disease = s1.next();
        doctorName = s1.next();
    }

    public void ShowAll()
    {
        System.out.println("Patient Name : " + patientName);
        System.out.println("Disease : " + disease);
        System.out.println("Doctor : " + doctorName);
    }
}

public class Demo105
{
    public static void main(String[] args) 
    {
      Hospital h = new Hospital();
      h.GetData();
      h.ShowAll();    
    }
}

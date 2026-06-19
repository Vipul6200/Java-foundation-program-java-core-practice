import java.util.Scanner;
class Library
{
    int bookId;
    String bookName;
    String author;

    public void GetData()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        System.out.print("Enter Book Name: ");
        System.out.print("Enter Author Name: ");
        bookId = s1.nextInt();
        bookName = s1.next();
        author = s1.next();
    }

    public void ShowAll()
    {
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
    }
}
public class Demo106
{
    public static void main(String[] args)
    {
        Library l = new Library();
        l.GetData();
        l.ShowAll();
    }
}
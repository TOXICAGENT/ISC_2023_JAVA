import java.util.Scanner;
public class BookFair
{
    String Bname;
    double price;
    void input()
    {
       Scanner object = new Scanner(System.in);
       System.out.println("Enter name and price of book");
       Bname=object.next();
       price=object.nextDouble();
    }
    void calculate()
    {
        double d;
       if(price<=1000)
       {
           d=0.02*price; price-=d;
       }
       else if(price>1000&&price<=3000)
       {
           d=0.10*price; price-=d;
       }
       else if(price>3000)
       {
           d=0.15*price; price-=d;
       }
    }
    void display()
    {
        System.out.println("Name of Book: "+Bname+" Price after discount: "+price);
    }
    public static void main(String args[])
    {
        BookFair object = new BookFair();
        object.input();
        object.calculate();
        object.display();
    }
}
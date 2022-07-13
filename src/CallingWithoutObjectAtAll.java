 
import java.util.Scanner;
public class CallingWithoutObjectAtAll
{
    static int pan;
    static String name;
    static double taxincome;
    double tax;
    
    static int input()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your name");
        name = ob.next();
        System.out.println("Enter your pan");
        pan = ob.nextInt();
        System.out.println("Enter the taxable income");
        taxincome = ob.nextDouble();
        return 0;
    }
    void caller()
    {
        CallingWithoutObjectAtAll.input();
    }
}

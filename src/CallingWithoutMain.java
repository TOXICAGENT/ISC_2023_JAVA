 
import java.util.Scanner;
public class CallingWithoutMain
{
    int pan;
    String name;
    double taxincome;
    double tax;
    
    int input()
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
        int ans = input();
    }
}

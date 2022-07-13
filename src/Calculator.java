import java.util.Scanner;
public class Calculator
{
    int a, b;
    void getVal()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a = ob.nextInt();
        b = ob.nextInt();
    }
}
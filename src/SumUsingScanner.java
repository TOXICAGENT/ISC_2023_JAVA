import java.util.Scanner;
public class SumUsingScanner
{
    public static void main(String args[]) 
    {
        int a, b, sum=0;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=object.nextInt();
        b=object.nextInt();
        sum=a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
        SumUsingScanner ob = new SumUsingScanner();
    }
}
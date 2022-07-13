import java.util.Scanner;
public class Fibonacci2nos
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a = 0, b= 1, sum = 0;
        System.out.println("Enter a limit for the fibonacci series");
        int n = ob.nextInt();
        while(sum<n)
        {
            System.out.print(a+", "+b+", ");
            sum=a+b;
            System.out.print(sum+", ");
            a = b;
            b = sum;
        }
    }
}
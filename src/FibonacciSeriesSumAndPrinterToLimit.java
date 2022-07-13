import java.util.Scanner;
public class FibonacciSeriesSumAndPrinterToLimit
{
    public static void main(String args[])
      { 
        int a=0, b=1, sum=0;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a limit");
        int limit = x.nextInt();
        int i=1, totalsum=0;
        System.out.println("This is the fibonacci series to limit "+limit+": ");
        System.out.print(a+", ");
        System.out.print(b);
        totalsum=a+b;
        for(i=3; i<=limit; i++)
        {
            sum = a + b;
            System.out.print(", "+sum);
            a=b;
            b=sum;
            totalsum+=sum;
        }
        System.out.println();
        System.out.println("And the sum of fibonacci series is "+totalsum);
    }
}
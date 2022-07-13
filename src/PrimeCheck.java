import java.util.Scanner;
public class PrimeCheck
{
    public static void main(String args[])
    {
     Scanner a =new Scanner(System.in);
     System.out.println("Enter a number(PrimeCheck)");
     int n = a.nextInt(), i, count=0;
     for(i=1; i<=n; i++)
     {
         if(n%i==0)
         count++;
         else
         continue;
     }
     if(count==2)
     System.out.println("The number "+n+" is prime");
     else
     System.out.println("The number "+n+" is not prime");
    }
}
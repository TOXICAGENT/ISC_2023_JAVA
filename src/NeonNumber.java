 
import java.util.Scanner;
public class NeonNumber
{
    public static void main(String args[])
    {
        Scanner i = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = i.nextInt();
       int n1 = n;
       int d=0, sq, sum=0;
       sq=n*n;
       while(sq>0)
       {
           d=sq%10;
           sum=sum+d;
           sq=sq/10;
       }
       if(sum==n1)
           System.out.print("It is a neon No");
       else
       
           System.out.print("it is not a neon no"); 
    }
}

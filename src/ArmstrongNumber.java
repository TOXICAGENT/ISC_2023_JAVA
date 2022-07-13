 
import java.util.Scanner;
public class ArmstrongNumber
{    
public static void main(String args[])
    {
      Scanner object=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = object.nextInt();
        int d=0, copy=n;
        double sum=0;
        while(n>0)
        {
            d=n%10;
            sum+=d*d*d;
            n/=10;
        }
        if(sum==copy)System.out.println("It is an Armstrong Number");
        else System.out.println("It is not an Armstrong Number");
    }
}
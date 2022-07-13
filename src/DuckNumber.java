import java.util.Scanner;
public class DuckNumber
{
   public static void main(String args[])
   {
        Scanner object=new Scanner(System.in);
        System.out.println("Enter a number");
        double n = object.nextDouble();
        double d=0, check=0, copy=n, count=0, duplicate=n;
        while(copy>0) // to check no of digits
        {
            d=n%10;
            count++;
            n/=10;
        }
        while(n>0) //to check number of digits apart from 0. i.e, if no is 10, total number of digits  = 1. 
        {
            d=n%10;
            if(d==0) break;
            n/=10;
            check++;
        }
        System.out.println((check<count)?"The number is a duck number(Has a 0)":"The number is not a duck number(Has a 0)");
    }
}
import java.util.Scanner;
public class SumOfDigits
{
   public static void main(String args[])
    {
        Scanner object=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = object.nextInt();
        int d=0, sum=0;
        while(n>0)
        {
            d=n%10;
            sum+=d;
            n/=10;
        }
        System.out.println("The sum of digits is: "+sum);
    }

}

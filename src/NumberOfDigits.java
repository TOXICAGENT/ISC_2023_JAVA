 
import java.util.Scanner;
public class NumberOfDigits
{
    public static void main(String args[])
    {
        Scanner object=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = object.nextInt();
        int d=0, count=0;
        while(n>0)
        {
            d=n%10;
            count++;
            n/=10;
         }
        System.out.println("The number of digits is/are: "+count);
    }
}

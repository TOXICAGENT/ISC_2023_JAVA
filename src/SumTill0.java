import java.util.Scanner;
public class SumTill0
{
    public static void main(String args[])
    {
        Scanner object = new Scanner(System.in);
        int sum=0;
        System.out.println("THIS PROGRAM IS TILL INFINITY ");
        System.out.println("Enter a number: ");
        int n=object.nextInt();
        sum+=n;
        while(n!=0)
        {
          System.out.println("Enter a number: ");
          n=object.nextInt();
          sum+=n;
        }
        System.out.println("The sum is: "+sum);
    }
}
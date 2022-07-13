 
import java.util.Scanner;
public class PrintingTernaryDirectlyUglyNumber
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = ob.nextInt();
        System.out.println((a%3==0)?(a%5==0)?"Is an ugly number":"NOt an ugly number" :"Not an ugly number");
    }
}
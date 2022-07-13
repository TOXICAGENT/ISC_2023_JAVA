 
import java.util.Scanner;
public class ConcatTwoNumbers
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = ob.nextInt();
        int b = ob.nextInt();
        System.out.println("Concatenated strings are: "+a+b);
    }
}
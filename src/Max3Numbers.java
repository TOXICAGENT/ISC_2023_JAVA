 
import java.util.Scanner;
public class Max3Numbers
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a, b and c");
        int a = ob.nextInt();
        int b = ob.nextInt();
        int c = ob.nextInt();
        System.out.println("Printing the largest number");
        System.out.println((a>b)?(a>c)?a:c : (b>c)?b:c);
    }
}
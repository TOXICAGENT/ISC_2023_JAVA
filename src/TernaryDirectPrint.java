 
import java.util.Scanner;
public class TernaryDirectPrint
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        System.out.println((a%2==0)?"Number is even":"Number is odd");
    }
}

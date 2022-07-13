
import java.util.Scanner;
public class ASCIIChecker
{
   public static void main(String args[])
   {
       Scanner ob = new Scanner(System.in);
       System.out.println((int)(' '));
       for(;;)
       {
            char ch = ob.next().charAt(0);
            System.out.println((int)ch);
        }
   }
}

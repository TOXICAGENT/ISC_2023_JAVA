import java.util.Scanner;
public class UnaryOperators
{
   public static void main(String args[])
   {
     Scanner ob = new Scanner(System.in);
     System.out.println("Enter a number");
     long n = ob.nextInt();
     System.out.println(n++);
     System.out.println(n--);
     System.out.println(n+=2);
     System.out.println(n--);
   }   
}

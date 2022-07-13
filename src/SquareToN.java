import java.util.Scanner;
public class SquareToN
{
   public static void main(String args[])
   {
       Scanner ob = new Scanner(System.in);
       System.out.println("Enter limit n. Program will print squares to n");
       int n = ob.nextInt(), i=1, sum=0;
       for(i=1;i<=n;i++) {System.out.println(" Square of "+i+" is: "+i*i); sum+=i*i; System.out.println(", and sum till now is: "+sum);}
   }
}

import java.util.Scanner;
public class NaturalRec
{
   int sum = 0;
   int sumNatural(int n)
   {
       if (n==0)
       return sum;
       else
       return n+sumNatural(n-1);

   } 
   public static void main ( String args [])
   {
       NaturalRec ob = new NaturalRec();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the upper Case");
       int n=sc.nextInt();
       int s=ob.sumNatural(n);
       System.out.println("The SUm is "+s);       
   }
}

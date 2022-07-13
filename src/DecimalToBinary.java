// 20 in binary is 10100
import java.util.Scanner;
public class DecimalToBinary
{
   public static void main(String args[])
   {
      Scanner ob = new Scanner(System.in);
      System.out.println("Enter a number in decimal format");
      int n = ob.nextInt();
      String ans="";
      while(n!=0)
      {
        int d = n%2;
    ans=Integer.toString(d)+ans;
    n/=2;
      }
      System.out.println("Number in binary:  "+ans);
   }
}
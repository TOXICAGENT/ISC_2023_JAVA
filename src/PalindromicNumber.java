import java.util.Scanner;
public class PalindromicNumber
{
   public static void main(String args[])
  
   {
       Scanner i = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = i.nextInt();
       int d, n1=n, rev=0;
       n=n1;
       while(n>0)
       {
           d=n%10;
           rev=(rev*10)+d;
           n/=10;
        }
       
       if(rev==n1)
           System.out.println("Palindromic");
       
       else       
           System.out.println("Not Palindromic");
    } 
}
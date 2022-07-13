 
import java.util.Scanner;
public class Automorphic_Number
{
    public static void main(String args[])
    {
        Scanner i = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = i.nextInt();
       int d=0, number_of_digits=0, n1 = n;
       while(n>0)
       {
           d=n%10;
           number_of_digits++;
           n=n/10;
       }
       double sq=Math.pow(n1,2);
       double y=sq%Math.pow(10,number_of_digits); // you need to  
       if(y==n1)
       System.out.println("Automorphic");
       else
       System.out.println("Not Automorphic");
    }
}

import java.util.Scanner;
public class GCDandLCM
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1=ob.nextInt();
        int n2 = ob.nextInt();  // the two numbers
        int gcd = 1;
        int min = (n1<n2)?n1:n2;
       for(int i = 1; i<=min; i++)
       {
    if(n1%i==0 && n2%i==0) gcd = i;
       }
       System.out.println("The GCD is:  "+gcd);
       System.out.println("The LCM is:  "+(n1*n2)/gcd);
    }
}
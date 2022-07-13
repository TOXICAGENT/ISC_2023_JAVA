import java.util.Scanner;
public class PrimeWithMethod
{
    public boolean prime(int n)
    {
        if(n==1) System.out.println("You have entered 1");
        int count=0; 
        int factors=1;
        boolean ans;
        for(factors=1; factors<=n; factors++)
        {
            if(n%factors==0)
            count++;
            else
            continue;            
        }
        if(count==2)
        ans=true;
        else 
        ans=false;
        return ans;
    }
    public static void main(String args[])
    {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = i.nextInt();
        PrimeWithMethod object = new PrimeWithMethod();
        boolean z = object.prime(a);
        System.out.println("The fact that the number is prime is "+z);
    }
}
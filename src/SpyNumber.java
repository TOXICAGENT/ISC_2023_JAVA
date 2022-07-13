import java.util.Scanner;
public class SpyNumber
{
    public static void main(String args[])
    {
        Scanner object=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = object.nextInt();
        int d=0, sumofd=0, copy=n, prodofd=1, duplicate=n, d2=0;
        while(n>0)
        {
            d=n%10;
            sumofd+=d;
            n/=10;
        }
        
        while(copy>0)
        {
            d2=copy%10;
            prodofd*=d2;
            copy/=10;
        }
        
        String ans=(prodofd+sumofd==duplicate)?"The number is a Spy Number":"The number is not a Spy Number";
        System.out.println(duplicate+": "+ans);
    }
}

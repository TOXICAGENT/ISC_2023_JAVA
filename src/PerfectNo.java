import java.util.Scanner;
public class PerfectNo
{
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner ob = new Scanner(System.in);
        int i, sum=0, n = ob.nextInt();
        for(i=1; i<n;i++)
           if(n%i==0) sum+=i;
        System.out.println(n+": ");
        System.out.print((sum==n)?"Is a perfect number":"Is not a perfect number");   
    }
}
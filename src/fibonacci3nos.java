import java.util.Scanner;
public class fibonacci3nos
{
    public static void main(String args[])
    {
        int sum=0, a=0, b=1, c=2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        System.out.print(a+", "+b+", "+c+", ");
        while(sum < n)
        {
            sum= a+b+c;
            if(sum>n)
            {
                break;
            }
            System.out.print(sum+", ");
            a=b;
            b=c;
            c=sum;
        }
    }
}

import java.util.Scanner;
class CircularPrime
{
    //Function for checking whether a number is prime or not
    boolean isPrime(int n)
    {
        int c = 0;
        for(int i = 1; i<=n; i++)
        {
            if(n%i == 0)
                c++;
        }
        if(c == 2)
            return true;
        else
            return false;
    }

    //Function to rotate the digits to form new number
    int rotate(int n)
    {
        String s = Integer.toString(n);
        String p = s.substring(1)+s.charAt(0);
        int a = Integer.parseInt(p);
        return a;
    }

    public static void main(String args[])
    {
        CircularPrime ob = new CircularPrime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a=n, flag=0;
        do
        {
            System.out.println(a);
            if(ob.isPrime(a)==false)
            {
                flag = 1;
                break;
            }
            a = ob.rotate(a);
        }while(a!=n);

        if(flag==1)
            System.out.println(n+" IS NOT A CIRCULAR PRIME");
        else
            System.out.println(n+" IS A CIRCULAR PRIME");
    }
}

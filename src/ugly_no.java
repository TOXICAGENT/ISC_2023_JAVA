import java.util.Scanner;
class ugly_no
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number");
        int n = ob.nextInt();
        if(n>0)
        {
            if(n%2==0)
            {
                if(n%3==0)
                {
                    if(n%5==0)
                    {
                        System.out.println(n+" is an ugly number");
                    }
                }
            }
        }
        else
        {
            System.out.println(n+" is not an ugly number");
        }
    }
}
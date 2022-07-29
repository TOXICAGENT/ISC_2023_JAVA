package inheritance;

import java.util.Scanner;
public class Account extends Bank
{
    static Scanner sc=new Scanner(System.in);
    double amt;
    Account(String n, int A, double pp)
    {
        super(n,A,pp);
        amt=0.0;
    }
    void deposit( )
    {
        System.out.print("\n Enter amount");
        amt=sc.nextDouble();
        p=p-amt;
    }
    void withdraw()
    {
        System.out.print("\n Enter amount");
        amt=sc.nextDouble();
        if(amt>p)
            System.out.println("INSUFFICIENT BALANCE");
        else
        {
            p=p-amt;
            if(p<500)
                p=p-(500-p)/10;
        }
    }
    void display()
    {
        super.display();
        System.out.println("Enter amount = "+amt);
    }
}
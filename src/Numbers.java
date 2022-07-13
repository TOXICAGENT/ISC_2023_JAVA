import java.util.Scanner;
public class Numbers
{
    void pow(int a, int b)
    {
        System.out.println("n1 raced to n2: "+(Math.pow(a,b)));
    }
    void min(int a, int b)
    {
        System.out.println("Minimum is: "+(Math.min(a,b)));
    }
    void max(int a, int b)
    {
        System.out.println("Maximum is: "+(Math.min(a,b)));
    }
    void round(double a)
    {
        System.out.println("Rounded number is: "+(Math.round(a)));
    }
    void random(double limit)
    {
        System.out.println("Hello. A random number from 1 to "+limit+" is: "+(1+Math.random()*limit));
    }
    void sqrt(int n)
    {
        System.out.println("Square root of "+n+" is "+(Math.sqrt(n)));
    }
    
}

import java.util.Scanner;
public class Overloading_NUMCALC 
{
    void num_calc(int num, char ch)
    {
        double ans;
        if(ch=='s')
        { ans=Math.pow(num,2); System.out.println("Answer is "+ans);} 
        else
        { ans=Math.pow(num,3); System.out.println("Answer is "+ans);}
    }
    void num_calc(int a, int b, char ch)
    {
        double ans;
        if(ch=='p')
        {ans=a*b; System.out.println("Answer is "+ans);}
        else
        {ans=a+b; System.out.println("Answer is "+ans);}
    }
    void num_calc(String s1, String s2)
    {
        String ans=(s1.equals(s2))?" are same":" are not the same";
        System.out.println(s1+" and "+s2+ans);
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        Overloading_NUMCALC object = new Overloading_NUMCALC();
        System.out.println("Enter a number");
        int n = ob.nextInt();
        System.out.println("Enter s for square. If you enter anything else, programme will find cube");
        char ch = ob.next().charAt(0);
        object.num_calc(n,ch);
        
        System.out.println("Enter two numbers");
        int a = ob.nextInt(), b=ob.nextInt();
        System.out.println("Enter p for product. If you enter anything else, programme will find sum");
        char ch2 = ob.next().charAt(0);
        object.num_calc(a,b,ch2);
        
        System.out.println("Enter two strings");
        String s1 = ob.next(), s2=ob.next();
        object.num_calc(s1,s2);
    }
}
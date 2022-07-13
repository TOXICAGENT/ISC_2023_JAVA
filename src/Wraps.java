 
import java.util.Scanner;
public class Wraps
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = ob.nextInt();
        Integer b = Integer.valueOf(a);
        int c = Integer.valueOf(b);
        System.out.println(a+" "+b+"  "+c);
        String s = "49000";
        int d = Integer.valueOf(s); // or ⬇
        System.out.println(Integer.parseInt(s));
        System.out.println(d);
        System.out.println("Enter a number");
        int e = ob.nextInt();
        String ans = Integer.toString(e);
        System.out.println(ans);
    }
}
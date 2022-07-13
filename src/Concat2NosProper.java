 
import java.util.Scanner;
public class Concat2NosProper
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = ob.nextInt();
        int b = ob.nextInt();
        String a_s = Integer.toString(a);
        String b_s = Integer.toString(b);
        String ans = (a_s.concat(b_s));
        System.out.println(Integer.parseInt(ans));
    }
}
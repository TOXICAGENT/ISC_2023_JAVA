import java.util.Scanner;
public class Concatenate2Strings
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter String 1");
        String s1=ob.next();
        System.out.println("Enter String 2");
        String s2=ob.next();
        System.out.println("Concatenated String: "+(s1+" "+s2));
    }
}

import java.util.Scanner;
public class OnlySpecialSameLengthAsFirst
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String a[] = new String[5];
        System.out.println("Enter 5 names");
        for(int i = 0;i<a.length; i++) a[i]=ob.next();
        String s;
        int l = a[0].length();
        for(int i = 0; i<a.length; i++)
        {
            s = a[i];
            if(s.charAt(0)==s.charAt(s.length()-1) && s.length()==l)
            System.out.println(a[i]);
        }
    }
}
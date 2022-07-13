import java.util.Scanner;
public class Special_and_Palindromic
{
    String s;
    public static void main(String args[])
    {
        Special_and_Palindromic ob = new Special_and_Palindromic();
        boolean c1=ob.isSpecial();
        boolean c2=ob.isPalindromic();        
        if(c1=true)
        {
            if(c2=true) System.out.println(" is both a special and palindromic string");
            else System.out.println("is a special string but not a palindromic string");
        }
        else if(c1=false)
        {
            if(c2==true)System.out.println(" is not a special but is a palindromic string.");
            else System.out.println(" is neither a special string nor a palindromic string.");
        }
    }
     boolean isSpecial()
    {
        int l = s.length();
        if(s.charAt(0)==s.charAt(l)) return true;
        return false;
    }
    boolean isPalindromic()
    {
        StringBuffer sb = new StringBuffer(s);
        sb = sb.reverse();
        String s_rev = sb.toString();
        System.out.println(s+":  ");
        if(s.compareTo(s_rev)==0) return true;
        return false;
    }
}
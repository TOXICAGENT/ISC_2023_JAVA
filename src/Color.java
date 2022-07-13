import java.util.Scanner;
public class Color
{
    String colTop;
    String colBottom;
    
    Color()
    {
        colTop="Pink";
        colBottom="Black";
    }
    Color(String a, String b)
    {
        colTop=a;
        colBottom=b;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        Color defAult = new Color();
        System.out.println(defAult.colTop+"    "+defAult.colBottom);
        System.out.println("=========Now Printing With non-default values");
        System.out.println("Enter two colors");
        String a = ob.next();
        String b = ob.next();
        Color known = new Color(a,b);
        System.out.println(known.colTop+"  "+known.colBottom);
    }
}
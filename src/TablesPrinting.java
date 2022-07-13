import java.util.Scanner;
public class TablesPrinting
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Tables Printing");
        System.out.println("Enter the number");
        final int num=ob.nextInt();
        System.out.println("enter the number of times");
        int i=ob.nextInt(), j;  System.out.println("======================================");
      
        for(j=1;j<=i;j++)
           System.out.println(num+" x "+j+" = "+(num*j));
    }
}
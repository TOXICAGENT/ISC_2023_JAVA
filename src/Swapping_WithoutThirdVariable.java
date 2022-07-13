import java.util.Scanner;
public class Swapping_WithoutThirdVariable
    {
        public static void main(String args[])
        {
            Scanner br=new Scanner(System.in);
            int a,b;
            System.out.print("Enter the 1st no: ");
            a=br.nextInt();
            System.out.print("Enter the 2nd no: ");
            b=br.nextInt();
 
            System.out.println("===============================");
            System.out.println("The numbers before swapping are");
            System.out.println("a = "+a);
            System.out.println("b = "+b);
 
            //Beginning of Swapping
            a=a+b;
            b=a-b;
            a=a-b;
 
            //End of Swapping
            System.out.println("===============================");
            System.out.println("The numbers after swapping are");
            System.out.println("a = "+a);
            System.out.println("b = "+b);
        }
    }
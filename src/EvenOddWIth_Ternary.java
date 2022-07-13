import java.util.Scanner;
public class EvenOddWIth_Ternary
{
    public static void main(String args[])
    {
        Scanner i = new Scanner(System.in);        
        System.out.println("Please enter a number");
        int no = i. nextInt();
        System.out.println("The programe will check if it is odd, even or zero");
        String check;
        check=(no%2==0)?"Is Even":"Is Odd";
        System.out.println(no+" "+check);
      }
   }
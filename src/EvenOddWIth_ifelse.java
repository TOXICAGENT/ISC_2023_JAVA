import java.util.Scanner;
public class EvenOddWIth_ifelse
{
    public static void main(String args[])
    {
        Scanner object = new Scanner(System.in);        
        System.out.println("Please enter a number");
        int no = object. nextInt();
        System.out.println("The programe will check if it is odd, even or zero");
        if(no!=0&&no!=1)
        {
        if(no%2==0)
         {
           System.out.println("The number is Even");
         }
        else
        System.out.println("The number is Odd");
      }
      else
      System.out.println("YOu have entered 1 or 0");
   }
}

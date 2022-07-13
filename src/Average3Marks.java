import java.util.Scanner;
public class Average3Marks
{
      public static void main(String args[])
      {
        double a, b, c, average=0;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the marks of three subjects");
        a=object.nextInt();
        b=object.nextInt();
        c=object.nextInt();
        average=(a+b+c)/3;
        System.out.println("The average of the marks "+a+" ,"+b+" and "+c+" is "+average);
      }
    }
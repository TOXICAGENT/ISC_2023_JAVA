import java.util.Scanner;
public class SumOfCubes
{
   public static void main(String args[])
      {
       Scanner ob = new Scanner(System.in);      
       int cube=0;
       System.out.println("Enter number 1");
       int n1 = ob.nextInt();  cube+=Math.pow(n1, 3);
       System.out.println("Enter number 2");
       int n2 = ob.nextInt(); cube+=Math.pow(n2, 3);
       System.out.println("Enter number 3");
       int n3 = ob.nextInt(); cube+=Math.pow(n3, 3);
       System.out.print("Sum of cubes: "+cube); 
       }
  }
import java.util.Scanner;
public class HarshadNumber
{
  public static void main(String args[])
  {
      Scanner ob=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=ob.nextInt();
      int copy=n, digisum=0, d;
      while(n>0)
      {
         d=n%10;
         digisum+=d;
         n/=10;
      }
      System.out.print(copy+": ");
      System.out.print((copy%digisum==0)?"Is a harshad number":"Is not a harshad number");}
}
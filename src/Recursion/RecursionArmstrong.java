import java.util.Scanner;
class RecursionArmstrong
{
   int number, sum;
   RecursionArmstrong(int num1)
   {
      number = num1;
      sum = 0;
   }
   void calculate()
   {
      int d = number, r;
      long total = (long)sum;
      while(d > 0)
      {
         r = d % 10;
         d = d / 10;
         total = total + (r*r*r);
      }
      if(number == total)
      {
         System.out.println("Given number is Armstrong number.");
      }
      else
      {
         System.out.println("Not an Armstrong number.");
      }
   }
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter the number: ");
      int num = sc.nextInt();
      RecursionArmstrong obj = new RecursionArmstrong(num);
      obj.calculate();
      sc.close();
   }
}
import java.util.Scanner;
public class GradeFeedback 
{
   public static void main(String args[])
    {
      Scanner object = new Scanner(System.in);
      System.out.println("Enter your grade: ");
      char grade = object.next().charAt(0);
      System.out.print("Your grade is " + grade);
      switch(grade) {
         case 'A' : System.out.print(": Excellent!");    break;
         case 'B' :
         case 'C' :
                    System.out.print(": Not Bad");
                    break;
         case 'D' : System.out.print(": You passed"); break;
         case 'F' : System.out.print(": Better try again");  break;
         default  : System.out.print(": Invalid grade");
      }
   }
}
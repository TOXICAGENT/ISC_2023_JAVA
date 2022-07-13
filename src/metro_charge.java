import java.util.Scanner;
public class metro_charge
{
    public static void main(String args[])
    {
      Scanner counter = new Scanner(System.in);
      System.out.println("Please enter your age");
      for(;;)
      {
      int age = counter.nextInt();
      if(age<=5)
      {
          System.out.println("No charges");
    }
    else if(age>5 && age<=18)
    {
        System.out.println("You need to pay Rs. 16");
    }
      else if(age>18)
         {
          System.out.println("You need to pay Rs. 30");     
           }
                else
              {
    
            }
      }
}
}
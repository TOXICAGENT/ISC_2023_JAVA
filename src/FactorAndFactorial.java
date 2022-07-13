import java.util.Scanner;
public class FactorAndFactorial
{
     public void factor(int n)
    {
     Scanner a =new Scanner(System.in);
     System.out.println("Enter a number");
     int count=0, i=1;
     for(i=1; i<=n; i++)
     {
         if(n%i==0)
         System.out.println(i);
         else
         continue;
     }
    
     } 
       public void factorial(int number)
    {
  Scanner x = new Scanner(System.in);
  for(;;)
  {
  System.out.println("Enter a number");
  int i,factorial=1;   
  for(i=1;i<=number;i++){    
      factorial*=i;    
  }    
  System.out.println("Factorial of "+number+" is: "+factorial);
  }
}
public static void main(String args[])
{
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = ob.nextInt();
    FactorAndFactorial object = new FactorAndFactorial();  
    object.factor(a);
    object.factorial(a);
}
}
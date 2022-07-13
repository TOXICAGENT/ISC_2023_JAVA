import java.util.Scanner;
public class FactorFactorialETC
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in); System.out.println("Enter a number"); double number = ob.nextDouble();
        int i,factorial=1;  // i is the numbers below number, factorial is the value of the factorial
        for(i=1;i<=number;i++){    
            factorial*=i;    
        }    
        System.out.println("Factorial of "+number+" is: "+factorial);

        System.out.println("Following are the factors of the number: ");
        int count=0; // count of factors
        i=1; 
        for(i=1; i<=number; i++) // i = possible factors 
        { 
            if(number%i==0)
            {System.out.print(i+", "); count++;}
            else
                continue;
        }

        System.out.println("And the number of factors is: "+count);
    }
}

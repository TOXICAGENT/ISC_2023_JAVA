import java.util.Scanner;
public class OddPrime
{
    int n;
    Scanner ob = new Scanner(System.in);
    OddPrime() { System.out.println("Enter a number: "); n = ob.nextInt();}
    
    boolean EveOdd(){ return (n%2!=0); }
    
    boolean isPrime()
    {
        int i = 1, count = 0;
        for(i=1;i<=n;i++)
        { if(n%i==0)count++; 
          else continue; 
        }
        return (count==2);
    }
    
    public static void main(String args[])
    {
        OddPrime object = new OddPrime();
        boolean Odd_Status = object.EveOdd();
        boolean Prime_Status = object.isPrime();
        if(Odd_Status==true&&Prime_Status==true) System.out.println("This is an odd prime number"); 
        else System.out.println("This is not an odd prime number");
    }
}
   
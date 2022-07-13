import java.util.Scanner; 
public class EmirpNumber
{
   public static  void main(String args[])
   {
     Scanner ob = new Scanner(System.in);
     System.out.println("Enter a number");
     int n = ob.nextInt();
     int d, rev=0;
     int n1=n;
     int i, count=0;
     for(i=1; i<=n; i++)
     {
         if(n%i==0)
         count++;
         else
         continue;
     }
     if(count==2)
     System.out.println("The number "+n+" is prime");
     else
     System.out.println("The number "+n+" is not prime");
     
     System.out.println("The programe will check if its reverse is also prime. If it is, it is an Emirp Number");
     while(n1>0)
     {     d=n%10;
           rev=(rev*10)+d;
           n/=10;
     }
       
       System.out.println("The reverse is: "+rev); 
       count = 0;
            for(i=1; i<=rev; i++)
     {
         if(rev%i==0)
         count++;
         else
         continue;
     }
     if(count==2)
     System.out.println("The reverse: "+rev+" is also prime. So it is an Emirp Number");
     else
     System.out.println("The reverse: "+rev+" is not prime. So it is not an Emirp Number");}
}
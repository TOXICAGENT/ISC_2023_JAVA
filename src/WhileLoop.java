import java.util.Scanner; 
public class WhileLoop 
{
   static void EmirpNumber()
   {Scanner ob = new Scanner(System.in);
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
       {
           d=n%10;
           rev=(rev*10)+d;
           n/=10;
       }
       
       System.out.println("The reverse is: "+rev);
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
     System.out.println("The reverse: "+rev+" is not prime. So it is not an Emirp Number");
    }
    static void DuckNumber()
   {Scanner object=new Scanner(System.in);
        System.out.println("Enter a number");
        double n = object.nextDouble();
        double d=0, check=0, copy=n, count=0, duplicate=n;
        while(copy>0)
        {
            d=n%10;
            count++;
            n/=10;
        }
        while(n>0)
        {
            d=n%10;
            if(d==0) break;
            n/=10;
            check++;
        }
        String ans;
        ans = (check<count)?"The number is a duck number(Has a 0)":"The number is not a duck number(Has a 0)";
        System.out.println(duplicate+": "+ans);
    }
    static void PalindronicNo ()
   {
       Scanner i = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = i.nextInt();
       int d, n1=n, rev=0;
       n=n1;
       while(n>0)
       {
           d=n%10;
           rev=(rev*10)+d;
           n/=10;
       }
       if(rev==n1)
           System.out.println("Palindromic");
       
       else       
           System.out.println("Not Palindromic");
    } 
    static void AutomorphicNumber()
    {
       Scanner i = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = i.nextInt();
       int d=0, number_of_digits=0, n1 = n;
       while(n>0)
       {
           d=n%10;
           number_of_digits++;
           n=n/10;
       }
       double sq=Math.pow(n1,2);
       double y=sq%Math.pow(10,number_of_digits); // you need to  
       if(y==n1)
       System.out.println("Automorphic");
       else
       System.out.println("Not Automorphic");
     }
     static void SumOfDigits()
    {
        Scanner object=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = object.nextInt();
        int d=0, sum=0;
        while(n>0)
        {
            d=n%10;
            sum+=d;
            n/=10;
        }
        System.out.println("The sum of digits is: "+sum);
    }
    static void nextInt()
    {
        Scanner object=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = object.nextInt();
        int d=0, count=0;
        while(n>0)
        {
            d=n%10;
            count++;
            n/=10;
         }
        System.out.println("The number of digits is/are: "+count);
    }
    static void ArmstrongNo()
    {
        Scanner object=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = object.nextInt();
        int d=0, copy=n;
        double sum=0;
        while(n>0)
        {
            d=n%10;
            sum+=d*d*d;
            n/=10;
        }
        if(sum==copy)System.out.println("It is an Armstrong Number");
        else System.out.println("It is not an Armstrong Number");
    }
    static void NeonNo()
    {
       Scanner i = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = i.nextInt();
       int n1 = n;
       int d=0, sq, sum=0;
       sq=n*n;
       while(sq>0)
       {
           d=sq%10;
           sum=sum+d;
           sq=sq/10;
       }
       if(sum==n1)
           System.out.print("It is a neon No");
       else
       
           System.out.print("it is not a neon no");
    }
    static void Harshad()
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
        System.out.print((copy%digisum==0)?"Is a harshad number":"Is not a harshad number");
    }
    static void SpyNumber() {Scanner object=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = object.nextInt();
        int d=0, sumofd=0, copy=n, prodofd=1, duplicate=n, d2=0;
        while(n>0)
        {
            d=n%10;
            sumofd+=d;
            n/=10;
        }
        
        while(copy>0)
        {
            d2=copy%10;
            prodofd*=d2;
            copy/=10;
        }
        
        String ans=(prodofd+sumofd==duplicate)?"The number is a Spy Number":"The number is not a Spy Number";
        System.out.println(duplicate+": "+ans);
    }
    public static void main(String args[])
    {
        WhileLoop object = new WhileLoop();
        object.EmirpNumber(); 
        object.DuckNumber();
        object.PalindronicNo(); 
        object.AutomorphicNumber(); 
        object.SumOfDigits();
        object.nextInt();
        object.ArmstrongNo();
        object.NeonNo();
        object.Harshad();
        object.SpyNumber();
    }
}
import java.util.Scanner;
class ForLoop 
{
    static void tablesprinting( )
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Tables Printing");
        System.out.println("Enter the number");
        final int num=ob.nextInt();
        System.out.println("enter the number of times");
        int i=ob.nextInt(), j;  System.out.println("======================================");
      
        for(j=1;j<=i;j++)
           System.out.println(num+" x "+j+" = "+(num*j));
        }   
    static void naturosumtoN()
    {   
        System.out.println("");

        System.out.println("I will print the sum of all natural numbers from 1 to n.");     
        System.out.println("Enter limit n");
             Scanner ob = new Scanner(System.in);
             int n=ob.nextInt(); int i, sum=0;
             System.out.println("The program will show the sum of natural nubers till n");
             for(i=1; i<=n; i++) 
                  
                      
                      sum+=i;
                  
                  System.out.println("======================================");
                    System.out.println(sum);
                }
    static void factorial()
    {
        System.out.println("");
        Scanner x = new Scanner(System.in);
  
  System.out.println("Enter a number");
  int number = x.nextInt();
  int i,factorial=1;   
  for(i=1;i<=number;i++)factorial*=i;    
  
  System.out.println("Factorial of "+number+" is: "+factorial);
}
static void PronicNumber()
{
        Scanner object = new Scanner(System.in);
        System.out.println("Enter a number");
        double n=object.nextDouble();
        double i=1, j=i+1;
        for(i=1;i<=n/2; i++)
        {
            if(i*j==n) System.out.println(n+" is a Pronic Number");
        }
}
static void FibonacciSeriesSum()
{       int a=0, b=1, sum=0;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a limit");
        int limit = x.nextInt();
        int i=1;
        int totalsum=0;
        System.out.print(a+", ");
        System.out.print(b);
        totalsum=a+b;
        for(i=3; i<=limit; i++)
        {
            sum = a + b;
            System.out.print(", "+sum);
            a=b;
            b=sum;
            totalsum=totalsum+sum;
        }
        System.out.println();
        System.out.println("The sum of fibonacci series is "+totalsum);
    }
    static void FibonacciSeriesPrinter()
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the limit of the fibonacci series");
        int limit = x.nextInt();
        int i=1, a=0, b=1, sum=0;
        System.out.println("This is the fibonacci series:");
        System.out.print(a+", ");
        System.out.print(b);
        for(i=3; i<=limit; i++)
        {
            sum = a + b;
            
            System.out.print(", "+sum);
            a=b;
            b=sum;
            // for fibonacci series sum, add : totalsum+=sum;//
        }
    }
    static void pattern1( )
   {
    int i, j;
     for(i=1; i<=4; i++)
     {
         for(j=1; j<=i; j++)
         {
             System.out.print(j);
         }
         System.out.println();
     }
   }
   static void pattern2( )
   {
     int i,j;
     for(i=1; i<=4;i++)
     {
         for(j=1; j<=i; j++)
         {
             System.out.print(i);
         }
         System.out.println();
     }
   }
   static void pattern3()
   {int i,j;
     for(i=1; i<=7;i+=2)
     {
         for(j=1; j<=7; j+=2)
         {
             System.out.print(j);
         }
         System.out.println();
     }
   }
   static void FactorPrinter()
   {Scanner a =new Scanner(System.in);
     System.out.println("Enter a number n. Factors of n are: ");
     int n = a.nextInt(), i;
     for(i=1; i<=n; i++)
     {
         if(n%i==0)
         System.out.println(i);
         else
         continue;
     }
     }
     static void FactorCount()
     { Scanner a =new Scanner(System.in);
     System.out.println("Enter a number");
     int n = a.nextInt(), i, count=0;
     for(i=1; i<=n; i++)
     {
         if(n%i==0)
         count++;
         else
         continue;
     }
     System.out.println(count);
     }
     static void PrimeCheck() 
     {Scanner a =new Scanner(System.in);
     System.out.println("Enter a number(PrimeCheck)");
     int n = a.nextInt(), i, count=0;
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
     }
     static void PrimeToN()
     {Scanner scanner = new Scanner(System.in);
      int i =0;
      int num =0;
      //Empty String
      String  primeNumbers = "";
      System.out.println("Enter the value of n:");
      int n = scanner.nextInt();

      for (i = 1; i <= n; i++)         
      {                    
         int counter=0;           
         for(num =i; num>=1; num--)
         {
        if(i%num==0)
        {
        counter = counter + 1;
        }
     }
     if (counter ==2)
     {
        //Appended the Prime number to the String
        primeNumbers = primeNumbers + i + " ";
     }    
      }    
      System.out.println("Prime numbers from 1 to n are :");
      System.out.println(primeNumbers);
   }
   static void SumOfPrimeToN()
   {Scanner ob=new Scanner(System.in);
        System.out.println("Enter a limit");
        int limit=ob.nextInt();
        int i, factors, count=0, sumtonow=0;
        System.out.println("List of Primes: ");
        for(i=1;i<=limit;i++)
        {
            for(factors=1; factors<=i;factors++)
            {
                if(i%limit==0)
                count++;
            }
            System.out.println((count==2)?(limit):"");
            System.out.print(", ");
            sumtonow+=limit;
        }
        System.out.println("And sum of primes="+sumtonow);
    }
    public static void main( )
    {
        ForLoop object = new ForLoop();
        object.tablesprinting();
        object.naturosumtoN();
        object.PronicNumber();
        object.FibonacciSeriesSum();
        object.FibonacciSeriesPrinter();
        object.pattern1();
        object.pattern2();
        object.pattern3();
        object.FactorPrinter();
        object.FactorCount();
        object.PrimeCheck();
        object.PrimeToN();
        object.SumOfPrimeToN();
    }
}

   
    


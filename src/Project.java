import java.util.Scanner; 
public class Project
{
    public static void main(String args[])
    {
        for(;;) // to endlessly ask for input
        {
            System.out.println("");
            System.out.println("==========================================================");
            Scanner ob = new Scanner(System.in);
            System.out.println("              Press  1 to check for Harshad/niven No.");
            System.out.println("              Press  2 to check for Palindrome No.");
            System.out.println("              Press  3 to check for Prime No.");
            System.out.println("              Press  4 to check for Spy No.");
            System.out.println("              Press  5 to check for Automorphic No.");
            System.out.println("              Press  6 to print Fibonacci Series and Sum.");
            System.out.println("              Press  7 to check for Armstrong No.");
            System.out.println("              Press  8 to check for Pronic No.");
            System.out.println("              Press  9 to check for Neon No.");
            System.out.println("              Press 10 to print Factors and related data.");
            System.out.println("              Press 11 to print number of digits.");
            System.out.println("              Press 12 to print sum of digits.");
            System.out.println("              Press 13 to print natural numbers to a limit.");
            System.out.println("              Press 14 to check for sign. (positive or negative)");
            System.out.println("              Press 15 to check if number is odd or even.");
            System.out.println("              Press 16 for grade feedback.");
            System.out.println("              Press 17 to check how good a movie is.");
            System.out.println("              Press 18 to find Average of 3 Marks");        
            System.out.println("              Press 19 to convert units of temperature");
            System.out.println("              Press 20 to calculate interest."); 
            System.out.println("              Press 21 to calculate income tax");
            System.out.println("              Press 22 to calculate Library Fine");
            System.out.println("              Press 23 to know whether you can drive your car on a specified date. (ODD EVEN RULES)");
            System.out.println("              Press 24 to check for PerfectNumber");
            System.out.println("              Press 25 to conduct a  mini Election");
            System.out.println("              Press 26 to check whether a number is a buzz number");
            System.out.println("              Press 27 to create a table of roll number, marks and name and also search for entries.");
            System.out.println("              Press 28 to exit.");
            System.out.println("==================================================================");
            System.out.println("              Enter Your Choice :");
            int ch = ob.nextInt(); // ch stands for your choice. It is in int data type because the choice is 1 - 28.
            boolean ans; // stores whether the fact that a number is a special number(like automorphic) is true or false
            System.out.println("Enter number you want to check. Ignore if you have chosen programmes not dealing with numbers");
            int n = ob.nextInt(); // stores the number you enter
            double n1=n; // to store a copy of number in double data type for special programmes 
            Project object = new Project(); // creates instance of a class of name object.
            switch(ch) // it does a check for all the possible values of your choice. object.<function_name>(arguements) 
                      //calls the respective functions
            {
                case 1: ans = object.isHarshad(n); System.out.println("The fact that "+n+" is a harshad number is "+ans); break;
                case 2: ans = object.isPalindrome(n); System.out.println("The fact that "+n+" a palindromic number is "+ans); break;
                case 3: String ans1 = object.isPrime(n); System.out.println(ans1);break;
                case 4: ans = object.isSpyNumber(n); System.out.println("The fact that "+n+"  a Spy Number is "+ans);  break;
                case 5: ans = object.isAutomorphic(n); System.out.println("The fact that "+n+" is a Automorphic number is "+ans);  break;
                case 6: object.FibonacciSeriesAndSum(); break;
                case 7: ans = object.isArmstrong(n); System.out.println("The fact that "+n+" is a Armstrong number is "+ans); break;
                case 8: ans = object.isPronic(n1); System.out.println("The fact that "+n+" is a Pronic number is "+ans); break;
                case 9: ans=object.isNeon(n); System.out.println("The fact that "+n+" is a Neon number is "+ans); break;
                case 10: object.FactorFactorialETC(); break;
                case 11: object.NumberOfDigits(n); break;
                case 12: object.SumOfDigits(n); break;
                case 13: int sum = object.NaturoSumToN(n); System.out.println("And sum of these numbers is "+sum);  break;
                case 14: object.SignCheck(n); break;
                case 15: object.EvenOdd(n); break;
                case 16: object.gradeFeedback(); break;
                case 17: object.MovieRating(); break;
                case 18: object.Average3Nos(); break;
                case 19: object.Temperature(); break;
                case 20: object.interestCalc(); break;
                case 21: object.IncomeTax(); break;
                case 22: object.LibraryFine(); break;
                case 23: object.OddEven(); break;
                case 24: object.PerfectNumber(); break;
                case 25: object.Elections(); break;
                case 26: object.isBuzz(n); break;
                case 27: object.RollnoNameMarksTable(); break;
                case 28: System.out.println("Exiting"); break;
                default: System.out.println("Wrong choice!!!!!!!");  break;  // if you enter say 0 or 29, which is out of the range            
            }
        }
    }
    
    void RollnoNameMarksTable()
    {
        Scanner ob = new Scanner(System.in);
        
        int rollno[] = new int[5]; int i;        
        for(i=0;i<5;i++) { System.out.println("Enter roll number of the student "+(i+1));    rollno[i]=ob.nextInt();  } 
        i=0;
        
        System.out.println("=======================================================================================================");
        
        String name[] = new String[5];
        for(i=0;i<5;i++) { System.out.println("Enter name of the student "+(i+1));   name[i]=ob.next();}
        i=0; 
        
        System.out.println("=======================================================================================================");
        
        int marks[]=new int[5];
        for(i=0;i<5;i++){ System.out.println("Enter marks of the student "+(i+1));   marks[i]=ob.nextInt();}
        i=0;
        
        System.out.println("=======================================================================================================");
        System.out.println("I will now print it in tabular form");
        System.out.println("=======================================================================================================");
        
        for(i=0;i<5;i++)System.out.println(rollno[i]+"  |  "+name[i]+"  |  "+marks[i]+"  |  ");
        System.out.println("=======================================================================================================");
        
        
        System.out.println("The following code will allow you to search for a record. Press 14 if you want to end this part." );
        i=0;
        for(i=1;i<=3;i++)
        {System.out.println("Enter 1 to search for a roll number ");
         System.out.println("Enter 2 to search for a name");
         System.out.println("Enter 3 to search for a mark");
         int ch = ob.nextInt();
             
        switch(ch)
        {
            case 1: System.out.println("Enter a roll number to search for"); int rollno_given = ob.nextInt();
        for(i=0;i<5;i++)
        {
            if(rollno[i]==rollno_given)System.out.println("Search succesful!  The student is "+name[i]);
        }
        
        
        case 2: System.out.println("Enter a name to search for"); String name_given = ob.next();
        for(i=0;i<5;i++)
        {
            if(name[i].equals(name_given))System.out.println("Search succesful!  The student's roll number is "+rollno[i]);
        }
        
        
        case 3: System.out.println("Enter a mark to search for"); int marks_given = ob.nextInt();
        for(i=0;i<5;i++)
        {
            if(marks[i]==marks_given)System.out.println("Search succesful!  The student with marks "+marks_given+" is"+name[i]);
        }
        
        case 18: break;
    }
    int x, loop_var, min=9999, max=0; 
          
    }
    }

    void isBuzz(int n)
    {
        if(n%10==7 || n%7==0) System.out.println(n+" is a buzz number"); 
        else System.out.println(n+" is not a buzz number"); 
    }

    void MovieRating()
    {
        int year;      // input the year
        String title;  // input the title of the movie 
        float rating;  // input the rating

        Scanner ob = new Scanner(System.in);          // to create scanner object     
        System.out.println("Enter the release year");
        year=ob.nextInt();      
        System.out.println("Enter the accepted rating of the movie");
        rating=ob.nextFloat();
        System.out.println("Enter the name of the movie");
        title=ob.nextLine();

        if(rating>=0&&rating<=5)
        {
            if(rating>=0&&rating<=2)      
                System.out.println(title+": Is a flop. Why bother to watch?");
            if(rating>=2.1&&rating<=3.4)      
                System.out.println(title+": Is a semi-hit. Why don't you try it?");
            if(rating>=3.5&&rating<=4.5)      
                System.out.println(title+": Is a hit. You should watch it");
            if(rating>=4.6&&rating<=5)      
                System.out.println(title+": Is a superhit. YOU HAVE TO WATCH IT!!!!!");
        }
        

        else 
            System.out.println("Start again");
    }    

    void Average3Nos()
    {
        double a, b, c, average=0; // a, b, c = the numbers. average = the value of the to-be calculated average
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the marks of three subjects");
        a=object.nextInt();
        b=object.nextInt();
        c=object.nextInt();
        average=(a+b+c)/3;
        System.out.println("The average of the marks "+a+" ,"+b+" and "+c+" is "+average);
    }

    void Temperature()
    {
        double tempf1, tempc1; // first temperature in fahrenheit and celcius
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the temperature in celcius");
        tempc1=object.nextDouble();
        tempf1=(tempc1*9/5)+32;
        System.out.println("The temperature of body in "+tempc1+" degree celcius is equal to "+tempf1+" degree fahrenheit");
        System.out.println("============================================================================================================================================");
        System.out.println("Enter the temperature in fahrenheit");
        double tempf=object.nextDouble();
        double tempc=(tempf-32)*5/9;
        System.out.println("The temperature of body in "+tempf+" degree fahrenheit is equal to "+tempc+" degree celcius"); 
    }

    void interestCalc()
    {
        double p, r, t, CI, SI; // (P*R*T)/100 = SI. P = p, R=r, T=t;
        String name;
        Scanner object = new Scanner(System.in);
        System.out.println("Please enter your first name");
        name=object.next();
        System.out.println("-------------------------------------------------------");
        System.out.println("Please enter the time period to be considered");
        t=object.nextDouble();
        System.out.println("-------------------------------------------------------");
        System.out.println("Please enter value deposited/borrowed");
        p=object.nextDouble();
        System.out.println("-------------------------------------------------------");
        System.out.println("Please enter the rate of interest");
        r=object.nextDouble();
        System.out.println("-------------------------------------------------------");
        double amount;
        SI=(p*r*t)/100;
        amount=SI+p;
        System.out.println("OR");
        System.out.println("You need to pay/receive Rs. "+amount+" due to Simple Interest of Rs. "+SI);
    }

    void gradeFeedback()
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

    void PerfectNumber()
    {
        System.out.println("Enter a number");
        Scanner ob = new Scanner(System.in);
        int i, sum=0, n = ob.nextInt(); // i=loop variable, sum=sum of factors, n = numbers;
        for(i=1; i<n;i++)
            if(n%i==0) sum+=i;
        System.out.println(n+": ");
        System.out.print((sum==n)?"Is a perfect number":"Is not a perfect number"); 
    }

    void Elections()
    {
        Scanner sc = new Scanner(System.in); int endcheck=0;
        int BJP=0, INC=0, OTH=0; System.out.println("VOTING STARTS NOW. ENTER end TO END ELECTION");
        while(endcheck==0)
        {
            System.out.println ("Which party do you support? (BJP, INC, OTH)");
            String party = sc.next();
            System.out.println("Thanks for voting");
            if(party.equals("BJP")) BJP++;
            if(party.equals("INC")) INC++;
            if(party.equals("OTH"))OTH++;
            if(party.equals("end"))endcheck=1;
            System.out.println("BJP: "+BJP);
            System.out.println("INC: "+INC);
            System.out.println("OTH: "+OTH);
        }    
        System.out.println("Thank you for voting");
    } 

    void IncomeTax()
    {
        Scanner object = new Scanner(System.in);
        System.out.println("Please enter your monthly salary");
        int annual_salary=(object.nextInt())*12;
        System.out.println("So your annual salary is: "+annual_salary);
        double tax=0;        
        if(annual_salary<100000)
            tax=0;
        else if(annual_salary>100000&&annual_salary<=300000)
            tax=(annual_salary-100000)*10/100;
        else if(annual_salary>300000&&annual_salary<=500000)
            tax=(annual_salary-100000)*20/100;
        else if(annual_salary<500000)
            tax=(annual_salary-100000)*30/100;
        else 
            System.out.println("You have made some mistake");

        System.out.println("You need to pay a tax of Rs. "+tax);
    }

    void LibraryFine()
    {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the number of days late you returned the book");
        int days=object.nextInt();
        int fine=0;
        if(days==0) 
        {
            fine=0;
            System.out.println("Good work! You don't need to pay any fine");
        }
        if(days>1&&days<=5) fine=5*days;
        if(days>5&&days<=20)fine=9*days;
        if(days>20)fine=10*days;
        if(fine!=0)System.out.println("Bad work! You need to pay a fine of Rs. "+fine);
    }

    boolean isHarshad(int n)
    {
        int copy=n, digisum=0, d; // copy = copy of numbers, digisum = sum of digits, d = digit
        while(n>0)
        {
            d=n%10;
            digisum+=d;
            n/=10;
        }
        if(copy%digisum==0)return true;
        else return false;
    }

    boolean isPalindrome(int n)
    {
        int d, n1=n, reverse=0;
        n=n1;
        while(n>0)
        {
            d=n%10;
            reverse=(reverse*10)+d;
            n/=10;
        }
        if(reverse==n1)
            return true;

        else       
            return false;
    }

    String isPrime(int n)
    {
        int i, count=0; // i = possible factors, count = number of factors
        for(i=1; i<=n; i++)
        {
            if(n%i==0) // N IS THE NUMBER
                count++;
            else
                continue;
        }
        if(count==2)
            return "The number "+n+" is prime";
        else
            return "The number "+n+" is not prime";
    }

    boolean isSpyNumber(int n)
    {
        int d=0 , sumofd=0, copy=n, prodofd=1, duplicate=n, d2=0; // d = digit, sumofd=sum fo digits prodofd
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

        if(prodofd+sumofd==duplicate)
            return true;        
        else 
            return false;
    }

    void FibonacciSeriesAndSum()
    {
        Scanner obc = new Scanner(System.in);
        int a=0, b=1, sum=0;
        System.out.println("Enter the limit of the fibonacci series");
        int limit = obc.nextInt();
        int i=1;
        System.out.println("This is the fibonacci series:");
        System.out.print(a+", ");
        System.out.print(b);
        int totalsum=0;
        for(i=3; i<=limit; i++)
        {
            sum = a + b;

            System.out.print(", "+sum);
            a=b;
            b=sum;
            totalsum+=sum;
        }
        System.out.println("The sum of fibonacci series is: "+totalsum);
    }

    boolean isArmstrong(int n)
    {
        int d=0, copy=n;
        double sum=0;
        while(n>0)
        {
            d=n%10;
            sum+=d*d*d;
            n/=10;
        }
        if(sum==copy) return true;
        else return false;
    }

    boolean isDuck(int n)
    {
        int d=0, check=0, copy=n, count=0, duplicate=n; // check is the number of digits excluding 0
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
        if(check<count) return true;
        else return false;
    }

    boolean isPronic(double n)
    {
        double i=1, j=i+1, ans=0;
        for(i=1;i<=n/2; i++)
        {
            if(i*j==n) ans=1;
            else             continue;
        }
        if(ans==1) return true;
        else return false;
    }

    

    boolean isAutomorphic(int n)
    {
        int d=0, x=0, n1 = n; // x = digit count, d = digit value, n1 = copy of n
        while(n>0)
        {
            d=n%10;
            x++; 
            n=n/10;
        }
        int sq=n1*n1;
        double y=sq%Math.pow(10,x); // y basically stores value of last 'a' digits, where a is the number of digits 
                                   //in the number(not the square)   
        if(y==n1)
            return true;
        else
            return false;
    }

    boolean isNeon(int n)
    {
        int n1 = n;
        int d=0, sq, sum=0; // d = digit value, sq = square of number, sum = sum of digits
        sq=n*n;
        while(sq>0)
        {
            d=sq%10;
            sum=sum+d;
            sq=sq/10;
        }
        if(sum==n1)
            return true;
        else

            return false;  
    }

    void FactorFactorialETC()
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

    void NumberOfDigits(int n)
    {
        int count=0; // count = number of digits
        while(n>0)
        {
            
            count++;
            n/=10;
        }
        System.out.println("The number of digits is/are: "+count);
    }

    void SumOfDigits(int n)
    {
        int d=0, sum=0; // d = digit value, sum = sum of digit
        while(n>0)
        {
            d=n%10;
            sum+=d;
            n/=10;
        }
        System.out.println("The sum of digits is: "+sum);
    }

    int NaturoSumToN(int n)
    {
        int i, sum=0; // sum = sum of natural numbers to now, i = natural numbers to n
        System.out.println("The program will show the sum of natural nubers till n");
        for(i=1; i<=n; i++) 
        {
            System.out.println(i);
            sum+=i;
        }
        return sum;
    }

    void FibonacciSeriesAndSum(int limit) 
    {
        int i=1, a=0, b=1, sum=0, totalsum=0; // i = loop variable, a = first value, b = second value, sum is the third value: a,b,sum is the series;
                                             //totalsum = sum of terms in series
        System.out.println("This is the fibonacci series:");
        System.out.print(a+", ");
        System.out.print(b);
        for(i=3; i<=limit; i++)
        {
            sum = a + b;
            System.out.print(", "+sum);
            a=b;
            b=sum;
            totalsum+=sum;
        }
        System.out.println("This is the sum of the fibonacci series: "+totalsum);
    }

    void SignCheck(int no) // where no is the number to be checked
    {
        System.out.println("The program will ceck if it is positive or negative.");
        if(no>0)

            System.out.println("The number is positive");
        else if (no==0)

            System.out.println("The number you have entered is 0");

        else

            System.out.println("The number is negative");
    }

    void OddEven()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the day");
        int day= ob.nextInt();
        System.out.println("Enter vehicle no (v_no)");
        int vno=ob.nextInt();
        String a1 = (day%2==0)?"eve":"odd"; // to store whether day is odd or even
        String a2 = (vno%2==0)?"eve":"odd"; // to store whether v_no is odd or even
        if(a1.equals("eve")&&a2.equals("eve")) System.out.println("You are free to drive");
        else if(a1.equals("odd")&&a2.equals("odd")) System.out.println("You are free to drive"); 
        else System.out.println("You cannot drive as day is "+a1+" while v_no is "+a2);
    }

    void EvenOdd(int no)
    {
        Scanner i = new Scanner(System.in);
        System.out.println("The programe will check if it is odd, even or zero");
        String check;
        check=(no%2==0)?"Is Even":"Is Odd";
        System.out.println(no+" "+check); 
    }    
}
import java.util.Scanner;
public class IncomeTaxCalculator 
{
    public static void main(String args[])
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
}

import java.util.Scanner;
public class Employee 
{
    String name;
    int pan;
    double taxincome;
    double taxable_income=0;
    double tax;
    double d1=0;
    public void input(double taxincome)
      {
          Scanner i = new Scanner(System.in);
          System.out.println("Please enter your name");
          System.out.println("Please enter your Please enter your PAN number");
          System.out.println("Please enter your income");
          name=i.next();
          pan=i.nextInt();
          taxincome=i.nextInt();          
    }
    public void calculate()
    {
        double tax=0;        
        if(taxincome<=100000)
        System.out.println("You need not pay any tax");
        else if(taxincome>150000 && taxincome<=250000)
        {
            taxable_income=taxincome-100000;
            tax=10/100*taxincome;
        }
        else if(taxincome>100000 && taxincome<=250000)
        {
            taxable_income=taxincome-100000;
            tax=5000+20/100*taxincome;
        }
        else if(taxincome>250000)
        {
           taxable_income=taxincome-100000;
           tax=25000+80/100;
        }
    }
}
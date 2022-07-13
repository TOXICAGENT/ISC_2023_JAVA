import java.util.Scanner;
public class EmployeePreboards
{
    /**
     * pan: to store the personal account number
       name: to store the name
       tax: to store the annual taxable income
       incometax: to store the tax that is calculated
     */
    long pan;
    String name;
    double tax;
    double incometax;
    EmployeePreboards()
    {
        pan = 0l;
        name="";
        tax=0;
        incometax=0.0d;
    }
    void input()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your name, \npan \nand then your annual taxable income  ");
        name=ob.next();
        pan=ob.nextLong();
        tax=ob.nextDouble();
    }
    void calc()
    {
       if(tax>250000)
       {
           if(tax<=500000)incometax+=(tax-250000)*10/100;
           else incometax+=25000;
       }
       if(tax>500000)
       {
           if(tax<=850000) incometax+=(tax-500000)*30/100;
           else incometax+=70000;
       }
       if(tax>850000) incometax+=(tax-850000)*30/100;
    }
    void display()
    {
        /**This function prints:
        pan, name, taxable income and income tax
        */
        System.out.println(pan+"\t"+name+"\t"+tax+"\t"+incometax);
    }
    public static void main(String args[])
    {
        EmployeePreboards obj = new EmployeePreboards();
        obj.input();
        obj.calc();
        obj.display();
    }
}
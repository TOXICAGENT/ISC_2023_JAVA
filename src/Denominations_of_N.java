import java.util.Scanner;
public class Denominations_of_N
{
    int Re1=0, Re2=0, Re5=0, Re50=0, Re100=0, Re500=0, Re1000=0, amt, bal=0;
    public static void main(String args[])
    {
        Denominations_of_N object = new Denominations_of_N();
        object.input_and_calculate();
        object.display();
    }
    
    void input_and_calculate()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter amount: "); amt=ob.nextInt();
        Re1000=amt/1000;
        bal=amt%1000;
        Re500=bal/500;
        bal=bal%500;
        Re100=bal/100;
        bal=bal%100;
        Re50=bal/50;
        bal=bal%50;
        Re5=bal/5;
        bal=bal%5;
        Re2=bal/2;
        bal=bal%2;
        Re1=bal;
    }
    
    void display()
    {
        System.out.println("Amount: "+amt);
        System.out.println("Rupees 1000 notes: "+Re1000);
        System.out.println("Rupees 500 notes: "+Re500);
        System.out.println("Rupees 100 notes: "+Re100);
        System.out.println("Rupees 50 notes: "+Re50);
        System.out.println("Rupees 5 notes: "+Re5);
        System.out.println("Rupees 2 coins: "+Re2);
        System.out.println("Rupees 1 coins: "+Re1);
    }
}
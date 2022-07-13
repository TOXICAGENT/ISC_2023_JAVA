import java.util.Scanner;
public class MenuDiscount
{
    public static void main(String args[])
    {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the marked price");
        double mp=object.nextDouble();
        double amt;
        int ch=0;
        if(mp>=5000&&mp<=10000)
        ch=1;
        else if(mp>10000&&mp<=20000)
        ch=2;
        else if(mp>20000&&mp<=500000)
        ch=3;
        else if(mp>50000&&mp<=100000)
        ch=4;
        switch(ch)
        {
            case 1: amt=mp-mp*0.20; System.out.println("You need to pay Rs. "+amt); break;
            case 2: amt=mp-mp*0.03; System.out.println("You need to pay Rs. "+amt); break;
            case 3: amt=mp-mp*0.04; System.out.println("You need to pay Rs. "+amt); break;
            case 4: amt=mp-mp*0.05; System.out.println("You need to pay Rs. "+amt); break;
            default: System.out.println("You have made some mistake, Lowest value: 5,000, highest value: 1,00,000");
        }
    }
}
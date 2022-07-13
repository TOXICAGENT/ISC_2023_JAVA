import java.util.Scanner;
public class CompoundANDSimpleInterestCalc
{
    public static void main(String args[])
    {
        double p, r, t, CI, SI;
        String x;
        Scanner object = new Scanner(System.in);
        System.out.println("Please enter your first name");
        x=object.next();
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
        double amount = Math.pow(p*(1+(r/100)),t);
        CI=amount-p;
        System.out.println("Dear "+x+", you need to pay/receive Rs. "+amount+" due to Compund  Interest of Rs. "+CI);
        SI=(p*r*t)/100;
        amount=SI+p;
        System.out.println("OR");
        System.out.println("You need to pay/receive Rs. "+amount+" due to Simple Interest of Rs. "+SI);
    }
}
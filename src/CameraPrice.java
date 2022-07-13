import java.util.Scanner;
public class CameraPrice
{
    public static void main(String args[])
    {
        Scanner object = new Scanner(System.in);
        System.out.println("enter price of camera");
        double mp=object.nextDouble();
        double sp, d1=10/100, d2=20/100;
        sp = mp-mp*d1;
        sp = sp-sp*d2;
        System.out.println("You need to pay Rs. "+sp);

    }
}
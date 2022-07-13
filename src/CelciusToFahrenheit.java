import java.util.Scanner;
public class CelciusToFahrenheit
{
    public static void main(String args[])
    {
        double tempf1, tempc1;
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
}
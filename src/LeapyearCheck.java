import java.util.Scanner;
public class LeapyearCheck
{
    public static void main(String args[])
    {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the year to check if it is a leapyear");
        int year=object.nextInt();
        String check=(year%4==0)?"The year is a leap year":"The year is not a leap year";
        System.out.println(year+": "+check);
    }
}
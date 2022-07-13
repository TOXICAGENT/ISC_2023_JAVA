import java.util.Scanner;
public class ParkingLot
{
    int vno, hours;
    double bill;
    
    void input()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter vehicle number");
        vno=ob.nextInt();
        System.out.println("Enter number of hours vehicle: "+vno+" has been parked");
        hours=ob.nextInt();
    }
    
    void calculate()
    {
       int numhours;
       numhours=hours-1;
       bill=(numhours*1.5)+3;
    }
    
    void display()
    {
        System.out.println("Dear owner of "+vno+", you need to pay Rs.  "+bill+" for parking for "+hours+" hours");
    }
}
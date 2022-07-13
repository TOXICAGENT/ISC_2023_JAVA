import java.util.Scanner;
public class TotalAverageSales
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        float sales[]=new float[5]; 
        int i;
        float total=0;
        System.out.println("Enter sales from day1 to day5 of working days");
        for(i=0;i<5;i++) sales[i]=ob.nextFloat();
        for(i=0;i<5;i++) total+=sales[i];
        System.out.println("Total sales = Rs. "+total);
        System.out.println("Average of total sales = Rs. "+(total/5));
    }
}
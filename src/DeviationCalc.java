import java.util.Scanner;
public class DeviationCalc
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = (ob.nextInt());
        String name[]=new String[n];
        double totalmarks[]=new double[n];
        System.out.println("Enter names of students");
        for(int i=0;i<n;i++) name[i]=ob.next();
        System.out.println("Enter marks of students");
        for(int i=0;i<n;i++) totalmarks[i]=ob.nextDouble();
        double total=0;
        for(int i=0;i<n;i++) total+=totalmarks[i];
        double avg=total/(n);
        System.out.println("Average = "+avg);
        double dev[]=new double[n];
        for(int i=0;i<n;i++) dev[i]=totalmarks[i]-avg;
        System.out.println("Name        Deviation");
        for(int i=0;i<n;i++) 
        System.out.println(name[i]+"        "+dev[i]);
    }
}
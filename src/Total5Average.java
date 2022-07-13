import java.util.Scanner; 
public class Total5Average
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        double [] marks = new double[5];
        int i; double total=0, avg=0;
        for(i=0; i<5; i++)
        {
            System.out.println("Enter marks of subject "+(i+1)); marks[i]=ob.nextDouble();
            total+=marks[i];
        }
        // avg = (marks[1]+marks[2]+marks[3]+marks[4]+marks[5])/5; is also correct.
        avg = total/5;
        System.out.println("Average of marks is "+avg);
    }
}
import java.util.Scanner;
public class WeightedMarks
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter term 1 marks: "); int t1=ob.nextInt();
        System.out.print("Enter term 2 marks: "); int t2=ob.nextInt();
        System.out.print("Enter term 3 marks: "); int t3=ob.nextInt();
        System.out.print("The weighted marks are: "+(0.3*(t1+t2)+0.4*t3));
    }
}

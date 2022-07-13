import java.util.Scanner;
public class OddEven
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the day");
        int day= ob.nextInt();
        System.out.println("Enter v_no");
        int vno=ob.nextInt();
        String a1 = (day%2==0)?"eve":"odd";
        String a2 = (vno%2==0)?"eve":"odd";
        if(a1.equals("eve")&&a2.equals("eve")) System.out.println("You are free to drive");
        else if(a1.equals("odd")&&a2.equals("odd")) System.out.println("You are free to drive"); 
        else System.out.println("You cannot drive as day is "+a1+" while v_no is "+a2);
    }
}
import java.util.Scanner;  
public class ExamEligibility
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter total number of school days: ");
        int total = ob.nextInt(); 
        System.out.println();
        System.out.print("Enter number of days attended");
        int attended = ob.nextInt();
        System.out.println();
        System.out.println("You can write the exam only is you have 75% attendance");
        System.out.println("============================================================================================================================");
        double att_perc=((attended/total));
        System.out.println(att_perc);
        String eligibility="";
        if(att_perc>=75) System.out.println("Your attendence percentage is "+att_perc+" which makes you elligible for the examination");
        else System.out.println("Your attendence percentage is "+att_perc+" which makes you illelligible for the examination");
    }
}
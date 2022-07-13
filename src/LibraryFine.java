import java.util.Scanner;
public class LibraryFine
{
    public static void main(String args[])
    {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the number of days late you returned the book");
        int days=object.nextInt();
        int fine=0;
        if(days==0) 
        {
            fine=0;
            System.out.println("Good work! You don't need to pay any fine");
        }
        if(days>1&&days<=5) fine=5*days;
        if(days>5&&days<=20)fine=9*days;
        if(days>20)fine=10*days;
        if(fine!=0)System.out.println("Bad work! You need to pay a fine of Rs. "+fine);
    } 
}
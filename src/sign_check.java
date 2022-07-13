import java.util.Scanner;
public class sign_check
{
    public static void main(String args[])
    {
        Scanner number = new Scanner(System.in);
        System.out.println("");
        System.out.println("Please enter a number.");
        for(;;)
        {
        int no = number.nextInt();
        System.out.println("The program will ceck if it is positive or negative.");
        if(no>0)
        {
            System.out.println("The number is positive");
}
else if (no==0)
{
    System.out.println("The number you have entered is 0");
}
else
{
    System.out.println("The number is negative");
}
}
}
}
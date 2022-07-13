import java.util.Scanner;
public class LinearSearch 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        double a[] = new double[10]; // creating an array of double datatype
        int i; // the loop variable
        System.out.println("Enter contents of the array");
        for(i=0;i<=9;i++)        a[i]=ob.nextDouble();
        System.out.println("=========================================================");
        System.out.println("Enter a number within array to check its index value"); double x = ob.nextDouble();
        int success=0; // if found , success is incremented to 1, else stays 0.
        for(i=0;i<=9;i++)
        {
            if(a[i]==x)
            {
                System.out.println("Search succesful! Value "+x+" is at index value "+i);
                success++;
            }
        }
        System.out.println((success==0)?"Search unsuccessful /t Thanks":"");
    }
}

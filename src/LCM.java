import java.util.Scanner;
public class LCM
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int n1 = ob.nextInt();
        int n2 = ob.nextInt();
        int max = (n1>n2)?n1:n2;
        int lcm=0;
        for(int i=max; i<=n1*n2; i++)
        {
          if(i%n1==0 && i%n2==0) 
          {
            lcm = i; 
            break;
          }
        }
        System.out.println("The LCM is: "+lcm);
    }
}
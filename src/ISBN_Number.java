import java.util.Scanner;
public class ISBN_Number 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter an ISBN number to check if it is a valid one...");
        int n = ob.nextInt();
        System.out.println();
        int i=0, d, sum=0, digicount=0;
        int copy = n;
        while(copy>0)
        {
            i++;
            d = copy%10;
            sum+=d*i;
            digicount++;
        }
        if(digicount==10)
          {
            if(sum%11==0) System.out.println(n+" is a valid ISBN number"); 
        
            else System.out.println(n+"not a valid ISBN number");
          }
           else System.out.println(n+"not a valid ISBN number"); 
    }
}

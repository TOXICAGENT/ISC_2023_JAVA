import java.util.Scanner;
public class Elections
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int BJP=0, INC=0, OTH=0;
        while(1 > 0)
        {
            System.out.println ("Which party do you support? (BJP, INC, OTH)");
            String party = sc.next();
            System.out.println("Thanks for voting");
            if(party.equals("BJP")) BJP++;
            if(party.equals("INC")) INC++;
            if(party.equals("OTH"))OTH++;
            
            System.out.println("BJP: "+BJP);
            System.out.println("INC: "+INC);
            System.out.println("OTH: "+OTH);
        }        
    }
}
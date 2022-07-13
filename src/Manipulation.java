import java.util.Scanner;
public class Manipulation
{
    public static void main(String args[])
    {
        Manipulation obj = new Manipulation();
        Scanner ob = new Scanner(System.in);
        System.out.printf("Enter a sentence");
        String s = ob.nextLine();
        System.out.printf("Enter a number");
        int i = ob.nextInt();
        obj.manip(s,i);
    }
    void manip(String str, int p)
    {
        if(p%2==0)
        {
            for(int i = 0; i<str.length(); i++)
            {
                if(i%2==0) System.out.println(str.charAt(i));
            } 
        }
        else
        {
            for(int i = 0; i<str.length(); i++)
            if(i%2!=0) System.out.println(str.charAt(i));
        }
    }
}
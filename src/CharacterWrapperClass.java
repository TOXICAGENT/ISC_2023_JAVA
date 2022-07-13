 
import java.util.Scanner;
public class CharacterWrapperClass
{
    public static void main(String args[])
    {  
        Scanner ob= new Scanner(System.in);
        char ch = ob.next().charAt(0);
        if(Character.isLetterOrDigit(ch)) 
        {
            System.out.println("Yes");
            System.exit(0);
        }
        
        
        else System.out.println("No");
    }
}
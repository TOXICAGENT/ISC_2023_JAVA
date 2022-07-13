import java.util.Scanner;
public class PrintStarting
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = ob.nextLine();
        s = s.toUpperCase();
        PrintStarting obj = new PrintStarting();
        obj.getAndPrintChars(s);
    }
    public void getAndPrintChars(String s)
    {
        Scanner sc = new Scanner(s);
        while(sc.hasNext())
        {
            String word = sc.next();
            System.out.println(word.charAt(0));
        }
    }
}
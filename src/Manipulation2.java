import java.util.Scanner;
public class Manipulation2
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        Manipulation2 obj = new Manipulation2();
        System.out.println("Enter 1 to compare 2 numbers, 2 to compare 2 characters and 3 to compare 2 strings lengthwise");
        int ch = ob.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter the two numbers");
            int a1 = ob.nextInt(); 
            int b1 = ob.nextInt();
            obj.compare(a1,b1);
            break;
            
            case 2: System.out.println("Enter the two characters");
            char a2 = ob.next().charAt(0);
            char b2 = ob.next().charAt(0);
            obj.compare(a2, b2);
            break;
            
            case 3:
            System.out.println("Enter the two strings");
            String a3 = ob.next();
            String b3 = ob.next();
            obj.compare(a3, b3);
            break;
        }
    }
    void compare(int a, int b)
    {
        System.out.println(Math.max(a,b));
    }
    void compare(char a, char b)
    {
        System.out.println((char)(Math.max((int)a, (int)b)));
    }
    void compare(String a, String b)
    {
        System.out.println(a.length()>b.length()?a:b);
    }
}
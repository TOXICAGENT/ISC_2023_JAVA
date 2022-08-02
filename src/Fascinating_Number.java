import java.util.Scanner;
public class Fascinating_Number {
    public static void main(String args[]) {
        int num, n2, n3;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        num = sc.nextInt();
        n2 = num * 2;
        n3 = num * 3;
        s = ""+num+ n2 + n3;
        int l = s.length();
        boolean found = true;
        for(char c = '1'; c <= '9'; c++)
        {
            int count = 0;

            for(int i = 0; i < l; i++)
            {
                char ch = s.charAt(i);

                if(ch == c)

                    count++;
            }

            if(count > 1 || count == 0)
            {
                found = false;
                break;
            }
        }
        if(found)
        {
            System.out.println("RESULT " + s);
            System.out.println("IS A FASCINATING NUMBER");
        }
        else
        {
            System.out.println("RESULT " + s);
            System.out.println(num + " is not a fascinating number.");
        }

    }
}

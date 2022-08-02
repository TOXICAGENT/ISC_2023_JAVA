import java.util.Scanner;
public class Fascinating_Number_Range {
    public static void main(String args[]) {
        int num, n2, n3;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range: ");
        num = sc.nextInt();
        for (int h = 0;h <= num ;h++ )
        {
            n2 = h * 2;
            n3 = h * 3;
            s = "" + h + n2 + n3;
            int l = s.length();
            boolean found = true;
            for (char c = '1'; c <= '9'; c++) {
                int count = 0;

                for (int i = 0; i < l; i++) {
                    char ch = s.charAt(i);

                    if (ch == c)

                        count++;
                }

                if (count > 1 || count == 0) {
                    found = false;
                    break;
                }
            }
            if (found)
            {
                System.out.println(h + " IS A FASCINATING NUMBER");
                System.out.println(" RESULT IS " + s);
            }

            s = "";
        }

    }
}

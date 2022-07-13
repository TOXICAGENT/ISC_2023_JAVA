import java.util.Scanner;
public class onlyDoubleCharacters
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = ob.nextLine();
        Scanner sc = new Scanner(s);
        String w = "";
        int ans = 0;
        while(sc.hasNext())
        {
            ans=0;
            w="";
            w = sc.next();
            for(int i = 1; i<w.length()-1; i++)
            {
                if(w.charAt(i-1)==w.charAt(i))
                {
                    if(ans==1) break;
                    System.out.println(w);
                    ans=1;
                }
            }
        }
    }
}
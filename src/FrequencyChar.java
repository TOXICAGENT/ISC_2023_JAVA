import java.util.Scanner; 
public class FrequencyChar
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String s=sc.nextLine();
        s = s.toUpperCase();
        int count=0;
        for(char ch='A';ch<='Z';ch++)
        {
            for(int i=0;i<s.length();i++)
            {
                char ch1=s.charAt(i);
                if(ch==ch1)
                count++;
            }
            if(count>0)
            System.out.println(ch+ "        "+ count);
            count=0;
        }
    }
}
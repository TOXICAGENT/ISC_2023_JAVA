import java.util.Scanner;
public class FrequencyOfCharacters
{
    public static void main(String[] args)
    {
        String sen="";
        char ch=' ',ch1=' ',maximumFrequencyCharacter=' ';
        int i=0,len=0,count=0,maxFrequency=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sen = sc.nextLine();
        sen=sen.toUpperCase();
        len=sen.length();
        for(ch='A';ch<='Z';ch++)
        {
            count=0;
            for(i=0;i< len;i++)
            {
                ch1=sen.charAt(i);

                if(ch1==ch)
                {
                    count++;
                }
            }
            if(count>maxFrequency)
            {
                maxFrequency=count;
                maximumFrequencyCharacter=ch;
            }
            System.out.println(ch+":"+count);
        }
        System.out.println("Character with maximum frequency in given sentence:"+maximumFrequencyCharacter);
    }
}

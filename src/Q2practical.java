import java.util.Scanner;
import java.util.StringTokenizer;
public class Q2practical
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0,len=0;//count is to store the number of words and len is used to store the lenght of the string
        String s="";//s is used to store the string
        char ch=' ',last=' ';// ch and len is use store the last letter
        System.out.print("Enter Sentence in UpperCase ");// input the string
        s = sc.nextLine();
        s = s.trim();// to remove the extra spaces
        len =s.length();// to store the lenght of the word
        last =s.charAt(len - 1);
        if(last!='.'&& last!='?'&& last!='!')// to find the invalid input
        {
            System.out.println("INVALID INPUT");

        }
        else
        {
            StringTokenizer st = new StringTokenizer(s, "? .!,");
            count = st.countTokens();// used to count the tokens
            String a[] = new String[count];
            for(int i = 0; i < count; i++)// used to store the words
            {
                a[i] = st.nextToken();
            }
            int sum =0;
            int p[] = new int[count];
            for (int i = 0; i<count; i++)// used to store the potential of the string
            {
                for (int j = 0; j<a.length;j++)
                {
                    char c =' '; 
                    c = a[i].charAt(j);
                    sum = sum +((int)c);
                }
                System.out.println(a+" = "+sum);
                p[i] = sum;
            }
            String tempS = "";
            for (int i = 0;i<count;i++)// used to sort the string
            {
                for (int j = i=1;j<count;j++)
                {
                    if (p[i]>p[j])
                    {
                        tempS = a[i];
                        a[i] = a[j];
                        a[j] = tempS;
                    }
                }
            }
            String f="";
            for(int i = 0;i<count;i++)// used to print the string
            {
                f = a[i]+" ";
            }
            System.out.println(f);
        }
    }
}
                
            
                    
            
import java.util.Scanner;
public class EncodingNotEfficient
{
   boolean isVowel(char ch)
   {
     if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U') return true;
     return false;
   }
   char replaceTheVowel(char ch)
   {
       char a[] = {'A', 'E', 'I', 'O', 'U'};
       for(int i = 0; i<a.length; i++)
       {
           if(ch==a[i])
           {
               if(i==4) ch='A';
               else return a[i+1];
           }
       }
       return '0';
   }
   public static void main(String args[])
   {
    Scanner ob = new Scanner(System.in);
    EncodingNotEfficient obj = new EncodingNotEfficient();
    System.out.println("Enter a sentence");
    String s = ob.nextLine();
    s=s.trim();
    s=s.toUpperCase();
    for(int i = 0; i<s.length(); i++)
    {
        char ch = s.charAt(i);
        if(obj.isVowel(ch)==true && ch!=' ')
        {
            char ch2 = obj.replaceTheVowel(ch);
            s=s.replaceAll(Character.toString(ch), Character.toString(ch2));
        }
        else if(obj.isVowel(ch)==false && ch!=' ') s=s.replaceAll(Character.toString(ch), Character.toString(((char)(ch+2))));
    }
    System.out.println(s);
    s=s.replace(" ", "$$");
    System.out.println("Final String: "+s);
   }
}
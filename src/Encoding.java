import java.util.Scanner;
public class Encoding
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
    Encoding obj = new Encoding();
    System.out.println("Enter a sentence");
    String s = ob.nextLine();
    s=s.trim();
    s=s.toUpperCase();
    char a[]=s.toCharArray();
    for(int i = 0; i<a.length; i++)
    {
        char ch = a[i];
        if(obj.isVowel(ch)==true && ch!=' ') a[i]=obj.replaceTheVowel(ch);
        else if(obj.isVowel(ch)==false && ch!=' ')a[i]=(char)(ch+2);
    }
    // s=s.replaceAll(" ","$$");
    System.out.println("Encoded string: "+s.replaceAll(" ","$$"));
   }
}
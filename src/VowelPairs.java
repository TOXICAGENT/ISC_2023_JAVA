import java.util.Scanner;
public class VowelPairs
{
 public static boolean isVowel(char ch)
 {
   if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
    {
      return true;
    }
   else
    {
      return false;
    }
}
public static void main(String args[])
{
Scanner sk = new Scanner(System.in);
System.out.println("Enter some words and I will make them in all caps and I'll print the vowel pairs");
String words= sk.nextLine();
words= words.toUpperCase();
int VowelPairsCounter= 0;
for(int i=0;i<words.length()-1;i++)
{
char c1=words.charAt(i);
char c2=words.charAt(i+1);
if(isVowel(c1) && isVowel(c2)){
System.out.println("Pair found: "+c1+c2);
VowelPairsCounter++;
}

}
System.out.println("Total pairs= "+ VowelPairsCounter);
}
}
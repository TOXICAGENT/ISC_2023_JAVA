import java.util.Scanner;
public class CactusJack
{
public static void main (String args[])
{
Scanner sk = new Scanner (System.in);
System.out.println("Enter a sentence");
String s= sk.nextLine();
Scanner sc = new Scanner (s);
int v= 0;
while(sc.hasNext())
{
String s2 = sc.next();
for(int i=0; i<s2.length()-1; i++)
{
char ch= s2.charAt(i);
char ch2= s2.charAt(i+1);
if(ch2==ch)
v++;
}
if(v>0)
System.out.println(s2);
}
}
}
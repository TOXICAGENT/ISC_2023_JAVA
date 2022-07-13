 
import java.util.Scanner;                    
public class FrequencyCheckAndSorted
{
  public static void main(String args[])
{
String s;
char c;
int max=0;
int x[] = new int[26];
Scanner in =new Scanner (System.in);
System.out.println("Enter a sentence?");
s=in.nextLine();
s=s.toUpperCase();
for(int i=65;i<=90;i++)
{
for(int j=0;j<s.length();j++)
{
    if((char)i==s.charAt(j))x[i-65]++;          
}
}
for(int i=0;i<26;i++)
{
for(int j=i+1;j<26;j++)
{
if(x[i]<x[j])
{
int temp=x[i];
x[i]=x[j];
x[j]=temp;
}
}
}
for(int i=0;i<26;i++)
{
System.out.println(x[i]);
}
}
}
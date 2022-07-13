import java.util.Scanner;
public class VowelCheck
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        char v[]={'a','e','i','o','u',};
        int i; char x;
        System.out.print("Enter a lowercase alphabet to check if it is a vowel......");
        x = ob.next().charAt(0); 
        int vowel_or_not=0;
        for(i=0;i<5;i++) if(x==v[i]) vowel_or_not=1; 
        System.out.println(x+((vowel_or_not==1)?"...Is a vowel":"...Is not a vowel"));
    }
}
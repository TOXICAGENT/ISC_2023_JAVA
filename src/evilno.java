
import java.util.Scanner;
public class evilno
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,p,a,d=0,i,l;
        String str="",str1;
        char ch;
        System.out.print("Enter Number: ");
        n= in.nextInt();
        p=n;
        while(p>0)
        {
            a=p%2;
            str=a+str;
            p=p/2;
        }
        str1=str;
        l=str.length();
        for(i=l-1;i>=0;i--)
        {
            ch= str.charAt(i);
            if(ch=='1')
            {
                d++;
            }
        }
        if(d%2==0)
        {
            System.out.println("Original Number : "+n);
            System.out.println("Binary Form : "+str1);
            System.out.println("It is an Evil Number : "+n);
        }
        else
        {
            System.out.println("Original Number : "+n);
            System.out.println("Binary Form : "+str1);
            System.out.println("It is not an Evil Number : "+n);
            in.close();
        }
    }
}
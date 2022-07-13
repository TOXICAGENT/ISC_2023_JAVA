/** 10100 in binary = 20 in decimal*/
import java.util.Scanner;
public class BinaryToDecimal
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number in binary format");
        int n = ob.nextInt();
        int copy = n;
        int count=0;
        while(copy!=0)
        {
            count++;
            copy/=10;
        }
        copy=n;
        int a[] = new int[count];
        int k = 0;
        while(copy!=0)
        {
            int d = copy%10;
            a[k]=d;
            k++;
            copy/=10;
        }
        String s = Integer.toString(n);
        int ans = 0;
        k=0;
        for(int i = 0; i<=s.length(); i++)
        {
            if(k==a.length)break;
            ans = (int)((Math.pow(2,i))*a[k]) + ans;
            k++;
        }
        System.out.println("Number in decimal: "+ans);
    }
}
import java.util.Scanner;
public class FormNewNumberDeescendingOfOriginal
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = ob.nextInt();
        int copy=n;
        int count=0;
        int k = 0;
        
        while(n!=0)
        {
            count++;
            n/=10;
        }
        int a[] = new int[count];
        n=copy;
        while(n!=0)
        {
            a[k]=n%10;
            n/=10;
            if(k==a.length) break;
            else k++;
        }
        n=copy;
        int temp;
        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<a.length-i-1; j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        int ans=0;
        for(int i = 0; i<a.length; i++)  
        ans = (ans*10)+a[i];
        System.out.println(n+" in descending order is: "+ans);
    }
}
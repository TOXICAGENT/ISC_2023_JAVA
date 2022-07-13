import java.util.Scanner;
public class SelectionSortPhoneNumbers
{
    public static void main(String args[])
    {
        long a[]=new long[20];
        Scanner ob = new Scanner(System.in);
        int loop;
        System.out.println("Enter array elements");
        for(loop=1; loop<20;loop++) a[loop]=ob.nextLong();
        int i, j;
        long temp;
        for(i=0; i<20; i++)
        {
            for(j=i+1;j<20;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for(loop=0;loop<20;loop++) System.out.println(a[i]+" ");
    }
}
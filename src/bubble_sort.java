import java.util.Scanner;
public class bubble_sort
{
    public static void main (String args[])
    {
        int i,j,temp;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int a[]=new int[10];
        for(i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<10;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}
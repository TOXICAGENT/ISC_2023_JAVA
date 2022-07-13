import java.util.Scanner;
public class BubbleSortAssignment
{
    public static void main(String args[])
    {
        int a[] = new int[5];
        int loop;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter array elements.....");
        for(loop=0;loop<5;loop++) a[loop]=ob.nextInt();
        int i, j, temp;
        for(i=0;i<5;i++) 
        {
            for(j=0;j<a.length-i-1;j++)
            {  
                if(a[j]>a[j+1])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
        }
        System.out.println("Therefore, the sorted  array is:  ");
        for(loop=0;loop<5;loop++)  System.out.println(a[loop]+" ");
    }
}
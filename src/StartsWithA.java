import java.util.Scanner;
public class StartsWithA
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String a[] = new String[20];
        System.out.println("Enter array elements");
        for(int i = 0; i<a.length; i++) 
        {
            a[i]=ob.next();
            if(a[i].startsWith("A")) System.out.println(a[i]);
        }
    }
}
import java.util.Scanner;
public class BinarySearchString
{
    public static void main(String args[])
    {
        BinarySearchString object = new BinarySearchString();
        int ans = object.check();
        if(ans==1) System.out.println("Search unsuccessful!");
        else System.out.println("Search successful! Position: "+ans);
    }
    int check()
    {
        Scanner ob = new Scanner(System.in);
        String a[] = new String[10];
        int i; String x; int l, u, mid; 
        l=0; u=a.length-1;
        System.out.println("Enter array elements");
        for(i=0;i<10;i++) a[i]=ob.next();
        System.out.println("Enter search element");
        x=ob.next();
        while(l<=u)
        {
            mid=(l+u)/2;
            if(a[mid].compareTo(x)==0) return mid;
            else if(a[mid].compareTo(x)<0) l=mid+1;
            else if(a[mid].compareTo(x)>0) u=mid-1;
        }
        System.out.println(x+": ");
        return 1;
     }
}
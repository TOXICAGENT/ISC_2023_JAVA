public class Armstrong1to1000
{
    public static void main(String args[])
    {
        int n, d;
        double sum=0.0d;
        for(int i = 1; i<1000; i++)
        {
            n=i;
            while(n!=0)
            {
                d=n%10;
                sum+=(d*d*d);
                n/=10;
            }
            if(sum==i) System.out.println(i);
            sum=0.0;
        }
    }
}
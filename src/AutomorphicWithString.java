public class AutomorphicWithString
{
    public static void main(String args[])
    {
        for(int n = 1; n<=1000; n++)
        {
            String x = Integer.toString(n);
            String x2 = Integer.toString(n*n);
            if(x2.endsWith(x)) System.out.println(n);
        }
    }
}
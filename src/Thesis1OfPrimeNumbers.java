public class Thesis1OfPrimeNumbers
{
    public static void main(String args[])
    {
        
        int spcount = 0;
        for(int i = 2; i<=1000; i+=1)
        {
            int fcount=0;
            int n=i;
            for(int j = 1; j<=n; j+=1)
                if(n%j==i)fcount+=1;

            if(fcount==2)
            {
                if(spcount>5)System.out.println(spcount+" upto "+i);
                
                spcount=0;
            }
            else spcount+=1;
        }
    }
}
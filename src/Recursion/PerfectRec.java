import java.util.Scanner; 
 public class PerfectRec 
{ 
    int num;
    PerfectRec (int nn)
    {
        num = nn; 
    }
    int sum_of_factors (int i)
    { 
        if (num == i) 
        return (sum_of_factors (i/2));
        else if (i == 1) 
        return (1);
        else if (num % i == 0)
        return (i + sum_of_factors (i-1));
        else
        return (sum_of_factors (i-1)); 
    }
    void check ( ) 
    { 
        if (num == sum_of_factors (num))
        System. out. println (" Perfect Number");
        else
        System. out. println ("Not Perfect Number"); 
    }
    public static void main (String args [ ] ) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out. println ("Enter one number");
         int n = sc.nextInt();
        PerfectRec ob = new PerfectRec (n);
        ob. check ( );
        sc.close();
    }
}
    
import java.util.Scanner; 
class Perfect 
{ 
    int num;
    Perfect (int nn)
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
        Perfect ob = new Perfect (n);
        ob. check ( );
    }
    }
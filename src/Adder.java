import java.util.Scanner;
public class Adder 
{
    int a[] = new int[2];
     
    Adder()
    {
        a[0] = 0;
        a[1] = 0;
    }
    void readtime()
    {
    Scanner x = new Scanner(System.in);
     System.out.println("Enter hours and minutes");
     a[0] = x.nextInt();
     a[1] = x.nextInt();
    }
    void disptime()
    {
        System.out.println("Hours=" + a[0]);
        System.out.println("Minutes=" + a[1]);
        System.out.println("Time ="+a[0]+"." + a[1]);
    }
    void addtime(Adder X, Adder Y)
    {
        a[1] = X.a[1] + Y.a[1];
        a[0] = a[1] / 60;
        a[1] = a[1] % 60;
        a[0] += X.a[0] + Y.a[0];
        
    }
    public static void main(String args [])
    {
        
        Adder a = new Adder();
        Adder b = new Adder();
        Adder c = new Adder();
        a.readtime();
        b.readtime();
        c.addtime(a, b);
        c.disptime();

    }
}
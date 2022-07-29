package inheritance;

public class Bank
{
    String  name;
    int accno ;
    double  p ;
    Bank(String n, int a, double pp)
    {
        name=n;
        accno =a;
        p =pp;
    }
    void display( )
    {
        System.out.println( "Name = "+name);
        System.out.println(	"Accout no = "+accno);
        System.out.println(	"Principal amount = " +p);
    }
}
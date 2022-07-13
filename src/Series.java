import java.util.Scanner;
public class Series
{
    int n;
    public Series()
    {
        Scanner ob = new Scanner(System.in); System.out.print("Enter limit of series: "); n=ob.nextInt();
    }

    void display1()
    {
        System.out.println("{Series 1 is 1, 4, 7, 10...................................n}");
        System.out.println("{Series 2 is 4*n+1                                          }");
    }
    
     void displaySeries()
    {
        int i=1, j=i;
        for(i=1;i<=n;i+=3) System.out.print(i+";");
        for(j=1; j<=n; j++) System.out.print(4*j+1); 
    }
    
    public static void main(String args[])
    {
        Series ob = new Series();
        ob.display1();
        ob.displaySeries();
    }
}
import java.util.Scanner;
public class point 
{
    double x,y;
    point()
    {
        x=0.0;
        y=0.0;
    
    }
    void readpoint()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter X and Y");
        x=sc.nextDouble(); 
        y=sc.nextDouble();

    }
    point midpoint(point a,point b)
    {
        point c=new point();
        c.x=(a.x=b.x)/2;
        c.y=(a.y=b.y)/2;
        return c;      
    }
    void displaypoint()
    {
        System.out.println("the mid point coordinates are "+x+","+y);
    }
    public static void main(String args[]) 
    {
        point a =new point();
        point b =new point();
        a.readpoint();
        b.readpoint();
        point r=new point();
        r=r.midpoint(a,b);
        r.displaypoint();
    }

}

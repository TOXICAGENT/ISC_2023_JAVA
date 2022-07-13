import java.util.Scanner;
public class OverloadingArea2
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        OverloadingArea2 obj = new OverloadingArea2();
        System.out.println("Press 1 to calculate area of scalene triangle");
        System.out.println("Press 2 to calculate area of a trapezium");
        System.out.println("Press 3 to calculate area of a rhombus");
        switch(ob.nextInt())
        {
            case 1: 
            System.out.println("Enter lengths of the sides of the triangle: ");
            double a = ob.nextDouble(); double b = ob.nextDouble(); double c = ob.nextDouble();
            System.out.println("Area of the triangle is:  "+obj.area(a,b,c));
            break;
            case 2: 
            System.out.println("Enter lengths of the parallel sides of the trapezium and the distance between them: ");
            int x = ob.nextInt(); int y = ob.nextInt(); int h = ob.nextInt();
            System.out.println("Area of the trapezium is:  "+obj.area(x,y,h));
            break;
            case 3: 
            System.out.println("Enter lengths of the diagonals of the rhombus: ");
            double d1 = ob.nextDouble(); double d2 = ob.nextDouble();
            System.out.println("Area of the rhombus is:  "+obj.area(d1, d2));
            break;
            default: System.out.println("Error, restart");
        }
    }
    double area(double a, double b, double c)
    {
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    double area(int a, int b, int height)
    {
        double area = height*(a+b)/2;
        return area;                                  // or simply return(0.5*height*(a+b));
    }
    double area(double diagonal1, double diagonal2)
    {
        double area = 0.5*diagonal1*diagonal2;
        return area;
    }
}
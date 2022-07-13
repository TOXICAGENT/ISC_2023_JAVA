 
import java.util.Scanner;
public class OverloadArea
{ 
        double area(double b, double h)
        {
            return b*h;
        }
        double area(float d1, float d2)
        {
            return (double)(0.5*d1*d2);
        }
        double area(double p1, double p2, double h)
        {
            return (0.5)*(p1+p2)*(h);
        }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        OverloadArea obj = new OverloadArea();
        System.out.println("Welcome to area calculation.");
        System.out.println("Press 1 for Parallelogram, 2 for Rhombus, 3 for trapezium");
        int ch = ob.nextInt();
        double ans=0.0;
        switch(ch)
        {
        case 1: System.out.println("Enter lengths of base and height"); double d1 = ob.nextDouble(); double d2 = ob.nextDouble(); ans=obj.area(d1,d2);System.out.println("The area of the shape you chose is: "+ans);
        case 2: System.out.println("Enter lenghts of diagonals"); float a = ob.nextFloat(); float b = ob.nextFloat();ans = obj.area(a,b);System.out.println("The area of the shape you chose is: "+ans);
        case 3: System.out.println("Enter lengths of parallel sides and height"); double side1 = ob.nextDouble(); double side2 = ob.nextDouble(); ans = obj.area(side1, side2);System.out.println("The area of the shape you chose is: "+ans);
        }        
    }
}
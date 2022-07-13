import java.util.Scanner;
public class AreaCalc 
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Area Calculation");
        System.out.println("1.Triangle");
        System.out.println("2.Rectangle");
        System.out.println("3.Square");
        System.out.println("4.Circle");
        System.out.println("5.Elipse");
        System.out.println("6.Exit");
        System.out.println("Please enter your choice (1 to 6)"); 
        System.out.println("Thank you");
        System.out.println("The program will calculate the area of the shape you have selected");
        double area, side, width, base, height, radius, r1, r2;             int x = a.nextInt();
        switch(x)
        {
           case 1: System.out.println();
           System.out.println("Enter the base of the triangle");
           base = a.nextDouble();
           System.out.println("Enter the height of the triangle");
           height = a.nextDouble();
           area = (base*height)/2;
           System.out.println("the area of the triangle in sq.units is "+area);
           break;
           case 2: System.out.println();
           System.out.println("Enter the height of the rectangle");
           base = a.nextDouble();
           System.out.println("Enter the height of the rectangle");
           height = a.nextDouble();
           area=base*height;
           System.out.println("The area of the rectangle in sq. units is "+area);
           break;
           case 3: System.out.println();
           System.out.println("Enter the side of the square");
           base = a.nextDouble();
           area=base*base;
           System.out.println("The area of the square in sq. units is "+area);
           break;
           case 4: System.out.println();
           System.out.println("Enter the radius of the rectangle");
           radius = a.nextDouble();
           area=radius*radius*Math.PI;
           System.out.println("The area of the circle is "+area);
           break;
           case 5: System.out.println();
           System.out.println("Enter the first radius of the ellipse");
           r1 = a.nextDouble();
           System.out.println("Enter the second radius of the rectangle");
           r2 = a.nextDouble();
           area=r1*r2*Math.PI;
           System.out.println("The area of the ellipse is "+area);
           break;
           default: System.out.println("Try again");
        }
    }
} 
import java.util.Scanner;
public class AreaCircumference
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int r = ob.nextInt();
        System.out.println("Area of circle with radius "+r+" is "+(Math.PI*Math.pow(r,2))+" and circumference is "+(Math.PI*2*r));
    }
}
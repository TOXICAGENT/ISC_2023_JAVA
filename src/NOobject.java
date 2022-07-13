 
import java.util.Scanner;
public class NOobject
{
    static double thisIsGood(int a, int b)
    {
        System.out.println(Math.ceil(Math.asin(Math.acos(Math.abs(Math.pow(a, -b))))));
        return a+b;
    }
    public void sampleMethod()
    {
        System.out.println("Enter 2 nos");
        Scanner ob = new Scanner(System.in);
        int x = ob.nextInt();
        int y = ob.nextInt();
        NOobject.thisIsGood(x, y);
        this.thisIsGood(x,y); 
        /**
         * the "this" statement invokes no methods, as the object has terminated...😉
        */
    }
}

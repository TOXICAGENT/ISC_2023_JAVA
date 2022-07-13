 
import java.util.Scanner;
public class ImportantToKnow
{
    public static void main(String args[])
    {
        Integer c = 155;
        Integer a = c;
        Integer d = 155;
        System.out.println(c==a); // this is also by memory
        System.out.println(c==d); // this is by memory
        System.out.println(c.equals(d)); // this is by value
    }
}
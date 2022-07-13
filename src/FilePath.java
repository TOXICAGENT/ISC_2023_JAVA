//example:: C:\pictures\admin\flower.jpg;
import java.util.Scanner;
public class FilePath
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i1 = s.lastIndexOf('\\');
        String path = s.substring(0,i1);
        int i2 =  s.lastIndexOf('.');
        String filename = s.substring(i1+1,i2);
        String extn = s.substring(i2+1);
        System.out.println("Path: "+path);
        System.out.println("Filename: "+filename);
        System.out.println("Extension: "+extn);
    }
}
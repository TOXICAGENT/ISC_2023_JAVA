import java.util.Scanner;
class BoxArea
{
    double width, height, length;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter width, height and length");
        width=sc.nextDouble();
        height=sc.nextDouble();
        length=sc.nextDouble();
    }
    void volume()
    {
        double vol;
        vol=width*height*length;
        System.out.println(vol+" is the volume");
    }
    public static void main(String args[])
    {
        BoxArea b=new BoxArea();
        b.input();
        b.volume();
    }
}
import java.util.Scanner;
public class ASCII
{
    public void dispASCII()
    {
        char chA='A', chZ='Z', cha='a', chz='z', char1='!';
        int ascA, ascZ, asca, ascz;
        System.out.println((int)chA);
        System.out.println(ascZ=(int)chZ);
        System.out.println(asca=(int)cha);
        System.out.println(ascz=(int)chz);
        int i = 1;
        int lettASCII1=(int)chA;
        int lettASCII2=(int)cha;
        int lettASCII3=(int)char1;
        for(i=1; i<=25; i++) System.out.println(++lettASCII1);
        System.out.println("================================================================================");
        for(i=1; i<=25; i++) System.out.println(++lettASCII2);
        System.out.println("================================================================================");
        for(i=1; i<=25; i++) System.out.println(++lettASCII3);
    }
}
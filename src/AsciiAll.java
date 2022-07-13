import java.util.Scanner;
public class AsciiAll
{
    public static void main(String args[])
    {
        System.out.println((int)('1'));
        for(int i = 0; i<=200; i++)
        {
            System.out.println((char)i);
        }
        char ch = 'µ';
        /**
         * char ch = '😢' // Does not work as 😢 unfortunately (😢) is not a  character�
         */
        System.out.println("________________________________________________-----------");
        System.out.println((int)ch);    
    }
}
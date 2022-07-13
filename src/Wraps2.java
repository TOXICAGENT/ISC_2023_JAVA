 
import java.util.Scanner;
public class Wraps2
{
    public static void main(String args[])
    {
        String s = "0.498";
        double s_1 = Double.parseDouble(s);
        float s_2 = Float.valueOf(s);
        /**
         * Now comes double to String 
        */
        double d1 = 0.498;
        String d_1 = Double.toString(d1);
        String d_2 = String.valueOf(d1);
        /**
         * Now comes Double() to double 
         */
        Double d2 = new Double("0.498");
        double d2_d = Double.valueOf(d2);
        double d3 = 0.498;
        Double d3_d = new Double(d3);
        
        //float flVal = Float.valueOf(d3);
    }
}
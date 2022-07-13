import java.util.Scanner;
public class LogicRunBubbleSort
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int no[] = new int[5];
        //String n[] = new String[5];
        System.out.println("enter numbers ");
        for(int i = 0; i<no.length; i++)
        {
            no[i] = ob.nextInt();
        }        
        int temp;
        // String tempS;
        // int min;
        for(int i = 0; i<no.length-1;i++)
        {
            for(int j=0;j<no.length-i-1;j++)
            {
                if(no[j]<no[j+1])
                {
                    temp = no[j+1];
                    no[j+1] = no[j];
                    no[j] = temp;
                }
            }
        }
        System.out.println("Sorted arrays are:");
        for(int i = 0; i<no.length; i++)
        {
            System.out.println(no[i]);
        }
    }
}
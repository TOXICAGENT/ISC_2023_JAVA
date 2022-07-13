import java.util.Scanner;
public class TopperList
{
    public static void main(String args[])
    {
        double marks[] = new double[5];
        String names[] = new String[5];
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter student's names and then marks");
        for(int i = 0; i<marks.length; i++) 
        {
            names[i]= ob.next();
            marks[i] = ob.nextDouble();
        }
        double tempD;
        String tempS;
        int min;
        for(int i = 0; i<marks.length; i++)
        {
            min = i;
            for(int j = i+1; j<marks.length; j++)
            {
                if(marks[j]>marks[min])
                min = j;    
            }
            tempD = marks[min];       tempS = names[min];
            marks[min] = marks[i];    names[min] = names[i];
            marks[i] = tempD;         names[i] = tempS;
        }
        for(int i = 0; i<marks.length; i++)
        {
            System.out.println("Student: "+names[i]+", position: "+(i+1));
        }
    }
}
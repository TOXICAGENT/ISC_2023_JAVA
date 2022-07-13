import java.util.Scanner;
public class NameContactList 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        long nos[] = new long[5];
        String names[] = new String[5];
        long tempL=0; 
        String tempS="";
        System.out.println("Enter 5 names"); 
        for(int i=0; i<5;i++) names[i]=ob.next();
        // System.out.println(names[0]+"   "+names[1]+"    "+names[2]+"    "+names[3]+"    "+names[4]);
        System.out.println("Enter 5 nos");
        for(int i=0; i<5;i++) nos[i]=ob.nextLong();
        // System.out.println(nos[0]+"   "+nos[1]+"    "+nos[2]+"    "+nos[3]+"    "+nos[4]);
        
        for(int i=0; i<names.length; i++)
        {
            for(int j=i+1;j<names.length-i-1;j++)
            {
                if(names[j].compareTo(names[j+1])>0)
                {               
                    tempS=names[i];     tempL=nos[i];
                    names[i]=names[j];   nos[i]=nos[j];
                    names[j]=tempS;        nos[j]=tempL;
                }
            }
        }
        for(int i=0;i<5;i++) System.out.println(names[i]+"       -       "+nos[i]);
    }
}

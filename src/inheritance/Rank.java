package inheritance;

import java.util.Scanner;
public class Rank extends Record
{
    Scanner sc=new Scanner(System.in);
    int index;
    public Rank()
    {
        super();
        index=0;
    }
    public void highest()
    {
        int i=0;
        for(i=0;i< 5;i++)
        {
            if(rnk[index]>rnk[i])
            {
                index=i;
            }
        }
    }
    public void display()
    {
        readvalue();
        highest();
        super.display();
        System.out.println("Name of the highest rank holder:"+name[index]);
    }
    public static void main(String args[])
    {
        Rank sc = new Rank();
        sc.readvalue();
        sc.highest();
        sc.display();
    }
}
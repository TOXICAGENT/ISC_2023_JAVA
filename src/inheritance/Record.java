package inheritance;

import java.util.Scanner;

public class Record
{
    Scanner sc=new Scanner(System.in);
    String name[]=new String[5];
    int rnk[]=new int[5];
    public Record()
    {
        for(int i=0;i< 5;i++)
        {
            name[i]="";
            rnk[i]=0;
        }
    }
    public void readvalue()
    {
        int i=0;
        System.out.println("enter names & ranks");
        for(i=0;i< 5;i++)
        {
            name[i]=sc.nextLine();
        }
        rnk[i]=sc.nextInt();

    }
    public void display()
    {
        int i=0;
        for(i=0;i< 5;i++)
        {
            System.out.println(name[i]+","+rnk[i]);
        }
    }
}





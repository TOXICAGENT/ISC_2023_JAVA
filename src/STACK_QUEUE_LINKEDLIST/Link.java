package STACK_QUEUE_LINKEDLIST;

public class Link
{
    int lnk[]=new int[100];
    int max,begin,end;
    Link(int mm)
    {
        max=mm;begin=0;end=0;
        lnk=new int[max];
    }


    void addlink(int v)
    {
        if(end< max)
        {
            lnk[end]=v;
            end=end+1;
        }
        else
        {
            System.out.println("OUT OF SIZE...");
        }
    }


    int dellink( )
    {
        int v;
        if(begin!=end)
        {
            v=lnk[begin];
            begin=begin+1;
            return v;
        }

        else
        {
            System.out.println("EMPTY...");
            return -99;
        }
    }


    void display()
    {
        for(int i=begin;i< end;i++)
        {
            System.out.println(lnk[i]);
        }
    }
}
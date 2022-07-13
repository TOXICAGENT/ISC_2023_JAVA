import java.util.Scanner;
public class Potential_arrangement2
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = ob.nextLine();
        int l = s.length();
        String s2[]=new String[l];
        int sum = 0, k=0;
        int pot[] = new int[l];
        char c = s.charAt(l-1);
        if (c == '.' || c == ',' || c == '?' || c == '!')
        {
            s = s.substring(0,(l-1));
            Scanner sc = new Scanner(s);
            while(sc.hasNext())
            {
                sum=0;
                String s1 = sc.next();
                int l1 = s1.length();
                for(int i=0;i<l1;i++)
                {
                    char ch = s1.charAt(i);
                    sum+=(int)ch;
                }
                s2[k]=s1;
                pot[k]=sum;
                System.out.println(s2[k]+" = "+pot[k]);
                k++;
            }
            int tempI;
            String tempS;
            for(int i = 0; i<k; i++)
            {
                for(int j=i+1;j<k; j++)
                {
                    if(pot[i]>pot[j])
                    {
                        tempI=pot[i];
                        pot[i]=pot[j];
                        pot[j]=tempI;

                        tempS=s2[i];
                        s2[i]=s2[j];
                        s2[j]=tempS;
                    }
                }
            }
            for(int i=0;i<k;i++)
                System.out.print(s2[i]+" ");
        }
        else
            System.out.println("INVALID INPUT");

    }
}
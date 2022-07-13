import java.util.Scanner;
public class PotentialArrangement
{
   public static void main(String args[])
   {
       Scanner ob = new Scanner(System.in);
       System.out.println("Enter a sentence");
       String s_ = ob.nextLine();
       String s[]=new String[10];
       int sum = 0, k=0;
       int pot[] = new int[10];
       Scanner sc = new Scanner(s_);
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
           s[k]=s1;
           pot[k]=sum;
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
                
                tempS=s[i];
                s[i]=s[j];
                s[j]=tempS;
               }
           }
       }
       for(int i=0;i<k;i++) 
       System.out.println(pot[i]+"    "+s[i]);
 }
}
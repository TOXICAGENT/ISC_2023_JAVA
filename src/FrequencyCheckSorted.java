import java.util.Scanner;
public class FrequencyCheckSorted
{ 
    public static void main(String args[])
    {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a sentence");
    String s = ob.nextLine();
    s = s.toLowerCase();
    int freq=0;
    int f[] = new int[26];
    char l[] = new char[26];
    for(char c = 'a'; c<='z'; c++)
    {
         for(int i = 0; i<s.length();i++)
          {
        char ch = s.charAt(i);
        if(ch==c) freq++; 
          }
        for(int i = 0; i<l.length; i++)
        {
            if(freq!=0) 
            {
                f[i]=freq;
                l[i]=c;
            }
        }
        freq=0;
    }
    int min, tempf;
    char tempc;
    for(int i = 0; i<f.length; i++)
    {
        min = i;
        for(int j=i+1; j<f.length; j++)
        {
            if(f[j]>f[min])
            {
              tempf=f[min];   tempc=l[min];
                  f[min]=f[j];    l[min]=l[j];
                  f[j]=tempf;     l[j]=tempc;
            }
        }
    }
    System.out.println("Printing sorted arrays:");
    
    for(int i = 0; i<f.length; i++) if(f[i]==0) System.out.println(f[i]); 
    
    for(int i = 0; i<f.length; i++)
    {
        System.out.println(l[i]+" | "+f[i]);
    }
     }
}
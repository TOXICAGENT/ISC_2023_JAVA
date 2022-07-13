import java.util.Scanner;
public class DoubleCharactersOnly
{
    public static void main(String args[])
    {
      Scanner ob = new Scanner(System.in);
      System.out.println("Enter a sentence");
      String s = ob.nextLine();
      Scanner sc = new Scanner(s);
      String w; 
      int ans=0;
      while(sc.hasNext())
      {
          w = sc.next();
          for(int i = 0; i<w.length()-1; i++)
          {
              if(w.charAt(i)==w.charAt(i+1))
              ans=1;
              
          }
          if(ans==1)System.out.println(w);
          ans=0;//error over here?
          //w="";
      }
    }
}
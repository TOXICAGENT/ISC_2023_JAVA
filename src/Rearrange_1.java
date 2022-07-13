import java.util.Scanner;
public class Rearrange_1
{
    String txt,Cxt;
    int len;
     Rearrange_1()
    {
        txt = " ";
        Cxt = " ";
        len =0;
    }
    void readWord()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter word in Upper Case");
        txt = sc.next();
        len = txt.length();
    }
    void convert()
    {    
        int n=0,b=0;
        String a = " ",d = " ";
        char c , ch;
        
         for (int i = 0;i<len;i++)
         {
             if (i == 0)
             {
                 ch = txt.charAt(i);
                if (ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
                {
                    Cxt = txt + 'Y';
                    break;
                }
             }
             else
             {
                ch = txt.charAt(i);
                if (ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
                {
                    n = i;
                    b = 1; 
                    break;
                    
                } 
                else
                {
                    Cxt = txt+'N';
                }

             }
         }
         if (b==1)
         {
             a = txt.substring(0,n);
             d = txt.substring(n);
             Cxt = d + a + 'C';
            }
        
    }
    void display()
    {
        System.out.println("original word "+Cxt);
        System.out.println("New word "+Cxt);
    }

    public static void main(String args []) 
     {
         Rearrange_1 obj = new Rearrange_1();
         obj.readWord();
         obj.convert();
         obj.display();
     }
          
}
import java.util.Scanner;
public class mobike
{
    int bno, phno, days, charge;
    String name;
    
    void input()
    {
        Scanner object=new Scanner(System.in); 
        System.out.println("Enter your name, bike number, phone number and number of days you have rented the bike in the same order");
        name=object.next();
        bno=object.nextInt();
        phno=object.nextInt();
        days=object.nextInt();
    }
    
    void computer()
    {
        int nd;
        if (days <= 5)
         { charge = (500*days);}
         else if (days > 5 && days <= 10) 
         { nd= (days -5);
           charge = ( nd*400);
           charge = charge + 2500;
        }
          else { nd = (days - 10);
                 charge = (nd * 200);
                 charge = charge + 4500;
                }
    }
    void display()
    {
        System.out.println("name        bike number         phone number        number of days          charge");
        System.out.println(name+"         "+bno+"                 "+phno+"                "+days+"               "+charge);
    }  
        
     public static void main(String args[])
    {
        mobike a1=new mobike();
        a1.input();
        a1.computer();
        a1.display();
    }    
}

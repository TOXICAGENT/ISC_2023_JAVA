import java.util.Scanner;  
public class RailwayTicket
{
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;
    
    void accept()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter name, coach, mob_no, basic amount");
        name = ob.next(); 
        coach = ob.next();
        mobno = ob.nextInt();
        amt = ob.nextInt(); 
    }
    void update()
    {
        if(coach.equals("FirstAC")) totalamt=amt+700;
        else if(coach.equals("SecondAC")) totalamt = amt+500;
        else if(coach.equals("ThirdAC")) totalamt = amt+250;
        else totalamt = amt;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Coach: "+coach);
        System.out.println("Total Amount: "+totalamt);
        System.out.println("Mobile Number: "+mobno);
    }
    public static void main(String args[])
    {
        RailwayTicket obj = new RailwayTicket();
        obj.accept();
        obj.update();
        obj.display();
    }
}
import java.util.Scanner;
public class ShowRoom
{
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;
    ShowRoom()
    {
        name = "";  
        mobno=0;
        cost = 0;
        dis=0;
        amount=0.0;
    }
    void input()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your name and mobile number");
        name = ob.next();
        mobno = ob.nextLong();
        System.out.println("Enter the cost of items bought");
        cost = ob.nextDouble();  
    }
    void calculate()
    {
        if(cost<=10000)dis=(5/100)*cost;
        else if(cost>10000 && cost<=20000) dis=(10/100)*cost;
        else if(cost>20000 && cost<=35000) dis = (15/100)*cost;
        else if(cost>35000) dis = (20/100)*cost;        
    }
    void display()
    {
        amount = cost-dis; 
        System.out.println(amount);
        System.out.println("Name  |  Mobile Number   |   Amount after discount");
        System.out.println(name+" |  "+mobno+"  |  "+amount+"  |  ");
    }
    public static void main(String args[])
    {
        ShowRoom salesman = new ShowRoom();
        salesman.input();
        salesman.calculate();
        salesman.display();
    }
}
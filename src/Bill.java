import java.util.Scanner;
public class Bill
{
    int billno, unit; String name; double amount;
    Bill(){ billno=0; unit=0;name=""; amount=0.0; }
    
    Bill(int bno, int units, String nm) { billno=bno; unit=unit; name=nm;}
    
    void calculate()
    {
        if(unit<=100) {amount = 0.0; System.out.println("Pay only monthly rental."); }        
        else if(unit>100 && unit<=200)amount=0.60*(unit-100);
        else if(unit>200 && unit<=300) amount = 1.0*(unit-100) + 0.60*(unit-200);
        else if(unit>300) amount=1.50*unit;
    }
    
    void display() {System.out.println(billno+"     "+unit+"     "+name+"     "+amount);}
    
    public static void main(String args[])
    { 
        Scanner ob = new Scanner(System.in); System.out.println("Enter bno, units, name"); int bno = ob.nextInt(); int units = ob.nextInt(); 
        String nm = ob.next();
        Bill object = new Bill(bno, units, nm);
        object.calculate();
        object.display();
    }
}
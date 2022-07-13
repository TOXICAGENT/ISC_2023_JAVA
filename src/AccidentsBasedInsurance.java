import java.util.Scanner;
public class AccidentsBasedInsurance
{
    public static void main(String args [])
    {
        int age,acc,ins=1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of accidents");
        acc=sc.nextInt();
        System.out.println("Enter age");
        age=sc.nextInt(); 
        switch(acc)
        {
           case 0: ins=ins+100;
           case 1: ins=ins+150;
           case 2: ins=ins+200;
           case 3: ins=ins+250;
          case 4: ins=ins+300;
          case 5: ins=ins+350;
        }
        if(age<25)
        {
         ins=ins+400;
        }
        System.out.println("Ins is "+ins);
    }
}
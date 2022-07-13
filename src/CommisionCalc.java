import java.util.Scanner;
public  class CommisionCalc
{
    public static void main(String args[])
    {
        Scanner object=new Scanner(System.in);
        double sales;
        double com;
        System.out.println("Enter the sales");
        sales=object.nextInt();
        if(sales<=50000)
        {
            System.out.println("You need not ay any commision"); 
        }
        else if(sales>=5001&&sales<=22000) 
        {
            com=0.03*sales;
            System.out.println("You need to pay your employee Rs. "+com);
        }
        else if(sales>=12001&&sales<=22000) 
        {
            com=0.07*sales;
            System.out.println("You need to pay your employee Rs. "+com);
        }
        else if(sales>=22001&&sales<=30000) 
        {
            com=0.10*sales;
            System.out.println("You need to pay your employee Rs. "+com);
        }
        else if(sales>30001) 
        {
            com=0.15*sales;
            System.out.println("You need to pay your employee Rs. "+com);
        }
     }
}
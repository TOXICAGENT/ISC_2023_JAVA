 import java.util.Scanner;
public class ElectricityTariff
{
     public static void main(String args[])
       {
         Scanner datasheet = new Scanner (System.in);
         System.out.println("Please enter how may units you have consumed"); 

         double used = datasheet.nextDouble();
         double pay=0;
         
             if(used>50)
           {
            
               if(used<101)
               {
                   pay+=(used-50)*0.75;
                } 
                   
                   else
                   { 
                       pay+=37.5;
                       if(used<251)
                       { 
                           pay+=(used-100)*1.25;
                        }
                       
                        else
                        {
                            pay+=187.5;                        
                            if(used<501)
                            { 
                                pay+=(used-250)*2.5;
                            }
                            else
                            {
                                pay+=625;
                                pay+=(used-499)*3;
                            }
                        }
                    }
         }
         pay+=180;
         if(used>250)
             pay+=75;

         double servicetax=(12.5/100)*pay;
         double educess=(2/100)*servicetax;
         pay+=servicetax;
         pay+=educess;
         pay-=(4/100)*pay;
         System.out.println("Dear customer, you have to pay rupees "+pay);
        }    
    }    

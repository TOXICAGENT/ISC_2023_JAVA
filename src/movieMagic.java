import java.util.Scanner;
public class movieMagic
{
   int year;
   String title;
   float rating;
   
   movieMagic()  // A constructor to initialize numeric data members to 0 and 
                 //String data member to “”.
   {
       year=0;
       title="";
       rating=0;
   }
   
   void input()
   {
       Scanner ob = new Scanner(System.in);               
       System.out.println("Enter the release year");
       year=ob.nextInt();      
       System.out.println("Enter the accepted rating of the movie");
       rating=ob.nextFloat();
       System.out.println("Enter the name of the movie");
       title=ob.next();
   }
   
   void display()
   {
       if(rating>=0&&rating<=5)
       {
        if(rating>=0&&rating<=2)      
           System.out.println(title+": Is a flop. Why other to watch?");
        if(rating>=2.1&&rating<=3.4)      
           System.out.println(title+": Is a semi-hit. Why don't you try it?");
        if(rating>=3.5&&rating<=4.5)      
           System.out.println(title+": Is a hit. You should you watch it?");
        if(rating>=4.6&&rating<=5)      
           System.out.println(title+": Is a superhit. YOU HAVE TO WATCH IT!!!!!");
        }
        
        else 
          System.out.println("Start again");
   }
   
   public static void main(String args[])
   {
       movieMagic object = new movieMagic();
       object.input();
       object.display();
   }
}

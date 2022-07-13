import java.util.Scanner;
public class RollNameMarksTable
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        
        int rollno[] = new int[30]; int i;        
        for(i=0;i<=29;i++) { System.out.println("Enter roll number of the student ");    rollno[i]=ob.nextInt();  } 
        i=0;
        
        System.out.println("=======================================================================================================");
        
        String name[] = new String[30];
        for(i=0;i<=29;i++) { System.out.println("Enter name of the student");   name[i]=ob.next();}
        i=0; 
        
        System.out.println("=======================================================================================================");
        
        int marks[]=new int[30];
        for(i=0;i<=29;i++){ System.out.println("Enter marks of the student");   marks[i]=ob.nextInt();}
        i=0;
        
        System.out.println("=======================================================================================================");
        System.out.println("We will now print in tabular form");
        System.out.println("=======================================================================================================");
        
        for(i=0;i<=29;i++)System.out.println(rollno[i]+"  |  "+name[i]+"  |  "+marks[i]+"  |  ");
        System.out.println("=======================================================================================================");
        
        
        System.out.println("The following code will allow you to search for a record." );
        i=0;
        for(;;)
        {System.out.println("Enter 1 to search for a roll number ");
         System.out.println("Enter 2 to search for a name");
         System.out.println("Enter 3 to search for a mark");
         int ch = ob.nextInt();
         if(ch>0) System.out.println("Error!!");
             
        switch(ch)
        {
            case 1: System.out.println("Enter a roll number to search for"); int rollno_given = ob.nextInt();
        for(i=0;i<=29;i++)
        {
            if(rollno[i]==rollno_given)System.out.println("Search succesful!  The student is "+name[i]);
        }
        
        
        case 2: System.out.println("Enter a name to search for"); String name_given = ob.next();
        for(i=0;i<=29;i++)
        {
            if(name[i].equals(name_given))System.out.println("Search succesful!  The student's roll number is "+rollno[i]);
        }
        
        
        case 3: System.out.println("Enter a mark to search for"); int marks_given = ob.nextInt();
        for(i=0;i<=29;i++)
        {
            if(marks[i]==marks_given)System.out.println("Search succesful!  The student with marks "+marks_given+" is"+name[i]);
        }
        
        default: System.out.println("Error............!!");
    }
    int x, loop_var, min=9999, max=0; 
    System.out.println("The following code will tell you the minimum and maximum marks...");
    
    for(loop_var=0;loop_var<30;loop_var++) {System.out.println("Enter number "+(loop_var)); marks[loop_var]=ob.nextInt();}
        
    for(loop_var=0;loop_var<30;loop_var++) {if(min>marks[loop_var])min = marks[loop_var]; if(max<marks[loop_var])max = marks[loop_var];}
    }    
    }
}
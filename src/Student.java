import java.util.Scanner;
public class Student
{
    String name;
    int age;
    double m1,m2,m3, maximum, average;
    
    Student(String a, double n1, double n2, double n3)
    {
         name = a;
         m1 = n1; m2=n2; m3=n3;
    }
    
    void AverageMaximum()
    {
        maximum=Math.max(m1,m2); maximum=Math.max(maximum, m3);        
        average = (m1+m2+m3)/3;        
    }
    
    void display() 
    {
        System.out.println("Maximum of "+m1+", "+m2+" and "+m3+" is "+maximum); 
        System.out.println("Average of "+m1+", "+m2+" and "+m3+" is "+average);
    }
    
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        for(;;)
        {
        System.out.print("Enter your name: ");
        String name = ob.next();
        System.out.println();
        System.out.print("Enter your age: ");
        int age = ob.nextInt();
        System.out.println();
        System.out.print("Enter marks of subject1: "); double n1 = ob.nextDouble();        
        System.out.print("Enter marks of subject2: "); double n2 = ob.nextDouble();
        System.out.print("Enter marks of subject1: "); double n3 = ob.nextDouble();
        
        Student object = new Student(name, n1, n2, n3);
        
        object.AverageMaximum();
        object.display();
        System.out.println("Thank you........ Enter 1 for a repeat!!! ");
        int ch = ob.nextInt();
        if(ch==1) continue;
        else break;        
        }
        System.out.println("Hope this programme helped................");
    }      
}
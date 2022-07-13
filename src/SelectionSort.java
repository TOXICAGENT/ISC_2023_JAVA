 
import java.util.Scanner;
public class SelectionSort
{ 
   public static void main(String args[])
   {
      Scanner ob = new Scanner(System.in);
      int a[] = new int[10];
      System.out.println("Enter array elements");
      for(int i = 0; i<a.length; i++) a[i]=ob.nextInt();
      
      int min, temp;
      for(int i = 0; i<a.length; i++)
      {
          min = i;
          for(int j = i+1; j<a.length; j++)
          {
              if(a[j]<a[min])
              {
                  temp=a[min];
                  a[min]=a[j];
                  a[j]=temp;
              }
          }
      }
        System.out.println("Printing sorted array");
        for(int i =0; i<a.length; i++)System.out.println(a[i]+" | ");
  } 
}
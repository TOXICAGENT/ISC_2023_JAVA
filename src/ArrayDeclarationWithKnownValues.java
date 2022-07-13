 
public class ArrayDeclarationWithKnownValues
{
  public static void main(String args[])
  {
      int arr[] = {1, 2, 3, 4, 5, 6};
      char ch[] = {'C', 'O','M', 'P', 'U', 'T', 'E', 'R'};
      String s = new String(ch);
      System.out.println(s);
      for(int i = 0; i<arr.length; i++) 
      System.out.println(arr[i]+" | ");
      char c[]= {'A','B','C','D','E'};
  }
}
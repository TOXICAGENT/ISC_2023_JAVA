public class outputs
{
   public static void main(String args[])
   {
       int a=18,b=20;
char c='a',c1='b';
System.out.println("Examination"+a+b);
System.out.println("Output is"+(a+c));
System.out.println(c+ b++);
System.out.println(a+c+"is the output");

int arr[]={2,8,16,9,5};
// int i=2;
// arr[i]=arr[i++] + arr[++i];
// arr[i-1]=arr[i]+ ++arr[i];
for(int k=0; k<arr.length; k++)
System.out.println(arr[k]);

// int j;
// for(j=10;;j++) System.out.print(j);
/*
 * This is an example of an infinite loop
 */
char ch = 'y';
for(;ch=='y';) 
{
    ch='n';
    System.out.print(ch);
}

for(int i=1; i<=10; i++)
{
    System.out.print(i);
    System.out.println();
    System.out.print(i);
}

System.out.println(((int)'A')+"     "+((int)'Z'));
    }
}

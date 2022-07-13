

import java.util.Scanner;

class fibonacciREC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = in.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    private static int fibonacci(int n){
        if(n==1){
            return 0;
        }
        else if(n == 2){
            return 1;
        } else {
            return fibonacci(n-2)+fibonacci(n-1);
        }

    }
}
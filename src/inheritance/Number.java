package inheritance;

public class Number {

    int i, f, nn, number; // Instance variables of Base class

    public Number(int n) {

        nn = n;   // initailize with the inputed value

    }

    // factorial() method with parameter

    public int factorial(int num) {

        number = num;

        f = 1;

        for (i = 1; i <= number; i++) {

            f = f * i;  // factorial calculation

        }

        return f;

    }

    // display() method with

    public void display() {

        System.out.println("Number:" + nn);

    }

}
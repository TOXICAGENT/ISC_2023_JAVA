package inheritance;

class Series extends Number
{

    int sum; // Instance Variable

    // Series constructor

    public Series(int n) {

        super(n);

        sum = 0;

    }

    // calculation of factorial in sum variable

    // with factorial() method from base class

    public void calcSum() {

        for (int i = 1; i <= nn; i++) {

            sum = sum + super.factorial(i);

        }

    }

    // drive class display method

    public void display() {

        super.display();

        System.out.println("Series sum:" + sum);

    }

}

package aranguren.bernadette;

/**
 * Created by Bernadette on 5/31/2016.
 */
public class Ex2 {
    public static void main(String[] args) {
        // Exercise 2.1
        // Implement fibonacci sequence

        System.out.println("EXERCISE 2.1");
        int n = 9, x1 = 0, x2 = 1, xn, c;

        for ( c = 0 ; c < n ; c++ )
        {
            if ( c <= 1 )
                xn = c;
            else
            {
                xn = x1 + x2;
                x1 = x2;
                x2 = xn;
            }
            System.out.println(xn);
        }



        // Use x1 = 0, x2 = 1 as starting variables
        // x3 = 1
        // x4 = 2
        // x5 = 3
        // x6 = 5
        // x7 = 8
        // x8 = 13
        // x9 = 21  (if n = 9, you should output 21)
        // Tips:
        // 1. Use int variables and loop of your choice (for, while, do-while)
        // 2. Equation form: Xn = Xn-1 + Xn-2
        // 3. You may need a variable to (a) hold current sum or (b) change values of the x's

        // Exercise 2.2
        // Implement a primality test of numbers from 2 to maxNumber
        ;
        System.out.println("EXERCISE 2.2");
        int prime, i =3, j;
        {
            System.out.println("2");
            for (i =3; i <= 1000; i++) {
                prime = i;
                for (j = 2; j <= (i - 1); j++) {
                    if (i % j == 0) {
                        prime = 0;
                        break;
                    }

                }
                if (prime != 0) {
                    System.out.println(prime);
                }
            }
        }
        // A number x is prime iff x >= 2, and its only factors are 1 and itself
        // Tips:
        // 1. To check if a number d divides x: (x % d == 0)
        // x mod d == 0
        // Having 0 as modulo means d divides x fully
        // Example: 100 % 50 = 0 (since 100/50 = 2 r 0), so 50 divides 100 fully
        // Example: 97 % 12 = 1, so 12 does not divide 97 fully since there is remainder 1
        // 2. For a given number 2 <= x <= maxNumber, you don't need to test from 2 to maxNumber
        // d should be less than x (d < x)
        // Example: given 97, there is no need to check if 75 can divide it fully
        // Determine the max value of d that minimizes the number of division tests
        // 3. Optional: all even numbers except 2 are automatically not prime
        // 2 is the only even prime number
    }

}

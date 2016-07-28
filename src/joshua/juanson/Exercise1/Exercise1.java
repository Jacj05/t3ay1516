package joshua.juanson;

public class Exercise1 {
    public static void main(String args[]) {

        // Exercise 1.1
        // FACTORIAL EXERCISE
        int n = 1, factorial = 5;//Declaration of integers
        for (int i = 1; i <= factorial; i++) {
            n = n * i;
        }//for loop
        System.out.println("Exericse 1.1\n");
        System.out.println("Factorial of " + factorial + " is " + n); //Factorial of 5 (5!)

        // Exercise 1.2
        //ODD NUMBERS
        int[] num = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};
        System.out.println("\nExercise 1.2\n");
        // Print all the odd numbers inside the nums array
        int b = 0;
        // Print all the odd numbers inside the nums array
        for (b = 0; b < 9; b++) {
            if (num[b] % 2 != 0) {
                System.out.println("Number " + num[b] + " is odd");
            }
        }
    }
}
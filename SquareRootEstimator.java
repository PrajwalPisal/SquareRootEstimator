/*      Title: Square Root Estimator

        Abstract: This program takes input from the user and validates it if it is a string or a integer.
        If its a string then it ask user to reenter the number with a warning " no words, just numbers".
        Once Correct number is entered it estimates square root.

        Author: Prajwal Pisal

        Date: 10/9/2021

 */

import java.util.*;
public class SquareRootEstimator {
    static int i = 0;
    public static void main(String[] args) {

        {
            System.out.println("This program estimates square roots.");
            System.out.println(" Please enter a whole number: ");
            Scanner sc = new Scanner(System.in);
            while (!sc.hasNextInt() || (i = sc.nextInt()) <= 0) {
                System.out.println("Enter a whole number (no words, just numbers): ");
                sc.nextLine();
            }

            double a = i / 2.0;
            double b = i / 2.0;

            int i = 0;
            sc.close();
            System.out.println("");

            do {
                a = b;
                b = (a + i / a) / 2.0;
                System.out.println("Current guess " + i +" :" + b);
                i++;
            }
            while ((a - b) / a > 0.01);
            System.out.printf("Estimated Root of %d is %.2f\n", i, b);
        }
    }
}


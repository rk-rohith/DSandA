package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        if (n >= 0) {
            int factorial = fact(n);
            System.out.println("factorial of " + n + " is " + factorial);
        }
    }


    private static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }
}

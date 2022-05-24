/***
 * The Fibonacci numbers/ Fibonacci Series, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 *
 * Example 1:
 * Input: n = 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 */
package Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 5;
        int sumOfFibonacci = fibonacciSeries(n);
        System.out.println("sumOfFibonacci " + sumOfFibonacci);

    }

    private static int fibonacciSeries(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int sumOfFibonacci = fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
        return sumOfFibonacci;
    }
}

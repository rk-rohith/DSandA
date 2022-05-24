/***
 * Pow(x, n)
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 *
 * Example 1:
 * Input: x = 2.00000, n = 10
 * Output: 1024.00000
 *
 * Example 2:
 * Input: x = 2.00000, n = -2
 * Output: 0.25000
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */

package Recursion;

public class NthPower {
    public static void main(String[] args) {
        double x = 2;
        int n = 10;

        double value = myPow(x, n);
        System.out.println("the " + x + " power " + n + " is " + value);
    }

    private static double myPow(double x, int n) {
        if (n < 0)
            return 1 / power(x, Math.abs(n));
        return power(x, n);
    }

    private static double power(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;

        if (n % 2 == 0)
            return power(x * x, n / 2);
        return x * power(x * x, n / 2);
    }
}

package Recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        if (n > 0)
            sum = sumOfNNumbers(n);
        System.out.println("sum of " + n + " no's is " + sum);
    }

    private static int sumOfNNumbers(int n) {
        if (n == 1) return 1;
        return n + sumOfNNumbers(n - 1);
    }
}
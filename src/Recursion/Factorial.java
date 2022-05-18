package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        if(n>=0){
            int factorial = fact(n);
            System.out.println("factorial of "+n+" is "+factorial);
        }
    }

    private static int fact(int n) {
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
}

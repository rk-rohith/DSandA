/***
 * Reverse an Array
 */
package Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5,6};

        int[] revArray = arrayReverse(0, a.length - 1, a);
        System.out.println(Arrays.toString(revArray));
    }

    private static int[] arrayReverse(int l, int r, int[] a) {
        if (l >= r) return a;
        swap(l, r, a);
        return arrayReverse(l + 1, r - 1, a);
    }

    private static void swap(int l, int r, int[] a) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }
}

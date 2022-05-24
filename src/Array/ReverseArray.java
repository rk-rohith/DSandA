/***
 * Reverse an Array
 */
package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] revArray = arrayReverse(arr);
        System.out.println(Arrays.toString(revArray));
    }

    private static int[] arrayReverse(int[] arr) {
        int[] revArray= new int[arr.length];
        int j = arr.length-1;
        for (int k : arr) {
            revArray[j] = k;
            j = j - 1;
        }
        return revArray;
    }
}

package Array;

/**
 * For an array arr of n elements, the cross product of the array, cp_arr, is defined as cp_arr = {(arr[i], arr[i])} for all 0<=i, j<n.
 *
 * Example 1:
 * There are n=3 elements in arr=[3,1,2] and K=7.
 * The cross product array, cp_arr = [(3, 3), (3, 1), (3, 2), (1, 3), (1, 1), (1, 2), (2, 3), (2, 1), (2, 2)).
 * When sorted, cp_arr = [(1, 1), (1, 2), (1, 3), (2, 1), (2, 2), (2, 3), (3, 1), (3, 2), (3, 3)]. The kth element, element 7 is (3, 1)
 *
 * Example 2:
 * There are n=2 elements in arr=[4,1] and K=3.
 * cp_arr = [(4,4),(4,1),(1,4), (1, 1)]
 * Sorted, cp_arr = [(1, 1), (1,4),(4,1),(4.4)]. The 3rd element is (4,1).
 */

import java.util.*;

public class KthSmallestTerm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of elements");
        Integer n = s.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("enter elements");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("enter the Kth smallest term");
        Integer k = s.nextInt();

        System.out.println(k + "th smallest term is " + findKthSmaalestTerm(arr, k));

    }

    private static List<Integer> findKthSmaalestTerm(Integer[] arr, Integer k) {
        List<Integer> integers = Arrays.asList(arr);
        Collections.sort(integers);

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < integers.size(); i++) {
            for (int j = 0; j < integers.size(); j++) {
                list.add(Arrays.asList(integers.get(i), integers.get(j)));
            }
        }
        System.out.println(list);
        return list.get(k);
    }
}

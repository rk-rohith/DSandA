package Array;

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

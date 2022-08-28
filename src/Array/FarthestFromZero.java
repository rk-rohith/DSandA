package Array;

import java.util.TreeSet;

public class FarthestFromZero {
    public static void main(String[] args) {
        int[] arr={-2,-8,-12,10, 22, 2, 4,-25};
        int value = farValueZero(arr);
        System.out.println(value);
    }

    private static int farValueZero(int[] arr) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i =0;i< arr.length;i++){
            ts.add(arr[i]);
        }
        int minValue = ts.first();
        int maxValue = ts.last();
        if(Math.abs(minValue)>maxValue){
            return minValue;
        }
        return maxValue;
    }

}

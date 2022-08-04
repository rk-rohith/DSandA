package Array;

import java.util.Arrays;

public class SortEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,7,9,10,22,37,12,35};
        rearrangeArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void rearrangeArray(int[] arr) {
        int n=arr.length;
        int j=-1;
        int temp =0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                j++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
}

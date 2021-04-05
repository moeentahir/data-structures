package data.structures.sort;

import data.structures.utils.Utils;

import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(int[] arr) {

        System.out.println("Initial array:" +  Arrays.toString(arr));
        int sorted = arr.length - 1;
        while (sorted > 0) {
            int maxIndex = 0;
            for (int i = 1; i <= sorted; i++) {
                if (arr[i] >= arr[maxIndex]) {
                    maxIndex = i;
                }
            }

            Utils.swap(arr, sorted, maxIndex);

            System.out.println("Array after swap: " + sorted + Arrays.toString(arr));
            sorted = sorted - 1;
        }
        return arr;
    }

}

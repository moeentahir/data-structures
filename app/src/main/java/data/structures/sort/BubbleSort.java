package data.structures.sort;

import data.structures.utils.Utils;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int[] arr) {

        int sorted = arr.length - 1;
        while (sorted != 0) {
            for (int i = 0; i < sorted; i++) {
                if (arr[i] > arr[i + 1]) {
                    Utils.swap(arr, i, i + 1);
                }
            }
            System.out.println("Array after index " + sorted + Arrays.toString(arr));
            sorted--;
        }
        return arr;
    }
}

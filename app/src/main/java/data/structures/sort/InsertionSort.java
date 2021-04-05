package data.structures.sort;

import data.structures.utils.Utils;
import jdk.jshell.execution.Util;

import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(int[] arr) {

        System.out.println("Initial array:" + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int insertionIndex = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (current < arr[j]) {
                    arr[j + 1] = arr[j];
                    insertionIndex = j;
                }
            }

            if (insertionIndex != -1) {
                arr[insertionIndex] = current;
            }

            System.out.println("Array after index: " + i + Arrays.toString(arr));
        }

        return arr;
    }

}

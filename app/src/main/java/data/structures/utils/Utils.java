package data.structures.utils;

public class Utils {
    public static void swap(int[] arr, int sorted, int maxIndex) {
        int temp = arr[sorted];
        arr[sorted] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}

package data.structures.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    @Test
    void sort_whenInReverseOrder_sortCorrectly() {
        int[] array = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = SelectionSort.sort(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    void sort_whenInRandomeOrder_sortCorrectly() {
        int[] array = {20, -15, 7, 35, 1, 55, -22};
        int[] expected = {-22, -15, 1, 7, 20, 35, 55};
        int[] actual = SelectionSort.sort(array);

        assertArrayEquals(expected, actual);
    }
}
package com.zsw.algorithm.sort;

import java.util.Arrays;

/**
 * 
 * øÏÀŸ≈≈–Ú
 * 
 * @author zsw
 */
public class QuickSort {
    
    public void quickSort(int[] arr) {
        int left = 0, right = arr.length - 1;
        quickSort(arr, left, right);
    }

    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pos = getPartitation(arr, left, right);
            quickSort(arr, left, pos - 1);
            quickSort(arr, pos + 1, right);
        }
    }

    public int getPartitation(int[] arr, int left, int right) {
        int tmp = arr[left];

        while (left < right) {
            while (left < right && tmp <= arr[right]) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && tmp >= arr[left]) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = tmp;
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {52, 548, 35, 54385, -2, 496};
        new QuickSort().quickSort(arr);
        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    }
}
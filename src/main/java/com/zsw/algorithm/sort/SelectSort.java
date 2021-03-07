package com.zsw.algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序
 * @Author zsw
 *
 */
public class SelectSort {

    public void selectSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < len; ++j) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {52, 548, 35, 54385, -2, 496};
        new SelectSort().selectSort(arr);
        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    }
}

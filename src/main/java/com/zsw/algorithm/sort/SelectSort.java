package com.zsw.algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序
 * @author zsw
 *
 */
public class SelectSort {

	public void selectSort(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			int min = i;
			for (int j = i+1; j < arr.length; ++j) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
	}
	
	public static void main(String[] args) {
		 int[] arr = {52, 548, 35, 54385, -2, 496};
		 new SelectSort().selectSort(arr);
		 Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
	}

}

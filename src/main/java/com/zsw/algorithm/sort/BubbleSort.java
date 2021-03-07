package com.zsw.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author zsw
 *
 */
public class BubbleSort {

	public void bubbleSort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {52, 548, 35, 54385, -2, 496};
		new BubbleSort().bubbleSort(arr);
		Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
	}

}

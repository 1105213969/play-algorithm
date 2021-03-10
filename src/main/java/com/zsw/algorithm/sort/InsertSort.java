package com.zsw.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 * @author zsw
 *
 */
public class InsertSort {

	public void insertSort(int[] arr) {
		int len = arr.length;
		for (int i = 1; i < len; ++i) {
			int j = i - 1;
			int tmp = arr[i];
			while (j >= 0  && arr[j] > tmp) {
				arr[j + 1] = arr[j];
				j--; 
			}
			arr[j + 1] = tmp;
		}
	}
	 
	public static void main(String[] args) {
	    int[] arr = {52, 548, 35, 54385, -2, 496};
	    new InsertSort().insertSort(arr);
	    Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
	}

}

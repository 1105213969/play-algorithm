package com.zsw.algorithm.arrary;

public class FindMedianSortedArrays {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] mergeNums = new int[len];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergeNums[k++] = nums1[i++];
            } else {
                mergeNums[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            mergeNums[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            mergeNums[k++] = nums2[j++];
        }

        if (len % 2 != 0) {
            return Double.valueOf(mergeNums[len / 2]);
        } else {
            return Double.valueOf(mergeNums[len / 2 - 1] + mergeNums[len / 2]) / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[] brr = {3, 4};
        new FindMedianSortedArrays().findMedianSortedArrays(arr, brr);
    }
}

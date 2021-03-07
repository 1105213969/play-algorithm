package com.zsw.algorithm.binarySearch;

/**
 * 二分查找
 */
public class BinarySearch {

    /**
     * 寻找一个数，最基本的二叉搜索
     * @param nums
     * @param target
     * @return
     */
    public int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 寻找左侧边界的二分搜索
     * @param nums
     * @param target
     * @return
     */
    public int leftBoundBinarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        //检查越界
        if (left >= nums.length || nums[left] != target) {
            return -1;
        }
        return left;
    }

    /**
     * 寻找右侧边界的二分搜索
     * @param nums
     * @param target
     * @return
     */
    public int rightBoundBinarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        //检查越界
        if (right < 0 || nums[right] != target) {
            return -1;
        }
        return right;
    }

    public static void main(String[] args) {
        int[] nums = {34, 51, 51, 51, 512, 513, 514, 519, 789, 7000, 56700};
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(nums, 51));
        System.out.println(bs.leftBoundBinarySearch(nums, 51));
        System.out.println(bs.rightBoundBinarySearch(nums, 51));
    }
}

package com.zsw.algorithm.arrary;

import java.util.*;

public class TopKFrequent {

    /**
     *
     * @param nums
     * @param k
     * @return 返回前k个高频元素
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((m, n) -> m[1] - n[1]);

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int num = entry.getKey(), cnt = entry.getValue();
            if (queue.size() == k) {
                if (cnt > queue.peek()[1]) {
                    queue.poll();
                    queue.offer(new int[]{num, cnt});
                }
            } else {
                queue.offer(new int[]{num, cnt});
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll()[0];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 1, 1, 3, 73, 1};
        new TopKFrequent().topKFrequent(arr, 2);
    }
}

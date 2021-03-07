package com.zsw.algorithm.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 */
public class Permute {

    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<Integer>(), arr);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> track, int[] arr) {
        if (track.size() == arr.length) {
            res.add(new ArrayList<>(track));
            return;
        }
        for (int i = 0; i < arr.length; ++i) {
            if (track.contains(arr[i])) {
                continue;
            }
            track.add(arr[i]);
            backtrack(res, track, arr);
            track.remove(track.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> resList = new Permute().permute(arr);
        resList.stream().forEach(a -> {
            a.stream().forEach(b -> System.out.print(b + " "));
            System.out.println();
        });
    }
}

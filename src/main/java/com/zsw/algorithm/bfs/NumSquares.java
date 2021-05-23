package com.zsw.algorithm.bfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class NumSquares {

    public int numSquares(int n) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i * i <= n; ++i) {
            set.add(i * i);
        }

        Queue<Integer> que = new LinkedList<>();
        que.add(n);

        int res = 0;
        while (!que.isEmpty()) {
            res++;
            int len = que.size();

            for (int i = 0; i < len; ++i) {
                Integer top = que.poll();

                for (int tmp : set) {
                    if (top.equals(tmp)) {
                        return res;
                    } else if (top > tmp) {
                        que.add(top - tmp);
                    } else {
                        continue;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        new NumSquares().numSquares(18);
    }
}

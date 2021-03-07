package com.zsw.algorithm.bfs;

import com.zsw.algorithm.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author zsw
 * @description: 二叉树的最小深度
 * @date 2020/12/15 7:28 下午
 */
public class MinDepth {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int min = 1;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                TreeNode cur = queue.poll();
                if (cur.left == null && cur.right == null) {
                    return min;
                }
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            min++;
        }
        return min;
    }

}

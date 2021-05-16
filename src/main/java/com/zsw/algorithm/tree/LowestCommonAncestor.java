package com.zsw.algorithm.tree;


/**
 * 二叉树的最近公共祖先
 */
public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null && right != null) {
            //p,q在右子树上
            return right;
        }
        if (left != null && right == null) {
            //p,q在左子树上
            return left;
        }
        if (left == null && right == null) {
            //没有公共祖先
            return null;
        }
        return root;
    }
}

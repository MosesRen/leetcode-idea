/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        int sum=0;
        if(root.left!=null&&root.left.left==null&&root.left.right==null) sum+=root.left.val;
        sum+=sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        return sum;
    }
}


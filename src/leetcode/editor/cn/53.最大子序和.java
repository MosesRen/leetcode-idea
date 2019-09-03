/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 *
 * https://leetcode-cn.com/problems/maximum-subarray/description/
 *
 * algorithms
 * Easy (44.28%)
 * Total Accepted:    50.9K
 * Total Submissions: 115K
 * Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 
 * 示例:
 * 
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 
 * 
 * 进阶:
 * 
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * 
 */
class Solution {
    public int maxSubArray(int[] nums) {

        int[] big =new int[A.length];//big数组记录遍历到当前i时最大的和。
        int max = A[0];//记录所有的最大值
        big[0]=A[0];
        for(int i=1;i<A.length;i++){
            big[i]=Math.max(A[i],big[i-1]+A[i]);
            max = Math.max(max,big[i]);
        }
        return max;
    }
}


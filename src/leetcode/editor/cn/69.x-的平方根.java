/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 *
 * https://leetcode-cn.com/problems/sqrtx/description/
 *
 * algorithms
 * Easy (35.41%)
 * Total Accepted:    32.1K
 * Total Submissions: 90.7K
 * Testcase Example:  '4'
 *
 * 实现 int sqrt(int x) 函数。
 * 
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * 
 * 示例 1:
 * 
 * 输入: 4
 * 输出: 2
 * 
 * 
 * 示例 2:
 * 
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842..., 
 * 由于返回类型是整数，小数部分将被舍去。
 * 
 * 
 */
class Solution {
    public int mySqrt(int x) {
        double t=(double)x;//(double)可以省
        double x0=x;
        x0=x0/2+t/(2*x0);
        while(Math.abs(x0*x0-t)>0.00001)
            x0=x0/2+t/(2*x0);
        return (int)x0;//double 转int类型必须使用强制类型转化 
    }
}


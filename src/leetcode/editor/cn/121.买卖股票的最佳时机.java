/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int max = 0, min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            max = Math.max(max,prices[i]-min);
        }
        return max;
    }
}

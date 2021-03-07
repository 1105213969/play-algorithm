package com.zsw.algorithm.dp;


//字符串最小编辑距离
//def minDistance(s1, s2) -> int:
//
//    def dp(i, j):
//        # base case
//        if i == -1: return j + 1
//        if j == -1: return i + 1
//        
//        if s1[i] == s2[j]:
//            return dp(i - 1, j - 1)  # 啥都不做
//        else:
//            return min(
//                dp(i, j - 1) + 1,    # 插入
//                dp(i - 1, j) + 1,    # 删除
//                dp(i - 1, j - 1) + 1 # 替换
//            )
//    
//    # i，j 初始化指向最后一个索引
//    return dp(len(s1) - 1, len(s2) - 1)

public class MinDistance {

	public int minDistance(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m + 1][n + 1];
		
		for (int i = 0; i <= m; ++i) {
			dp[i][0] = i;
		}
		for (int j = 0; j <= n; ++j) {
			dp[0][j] = j;
		}
		for (int i = 1; i <= m; ++i) {
			for (int j = 1; j <= n; ++j) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i-1][j-1];
				} else {
					dp[i][j] = Math.min(Math.min(dp[i][j - 1] + 1, dp[i - 1][j] + 1), dp[i - 1][j - 1] + 1);
				}
			}
		}
		return dp[m][n];
	}
	
	public static void main(String[] args) {
		System.out.println(new MinDistance().minDistance("horse", "ose"));
	}
}

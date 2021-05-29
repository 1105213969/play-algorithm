package com.zsw.algorithm.dp;

/**
 * 最长回文子串
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {
         //dp[i][j] s[i...j]是回文子串
         if (s.length() < 2) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); ++i) {
            dp[i][i] = true;
        }
        int maxLen = 1;
        int start = 0;
        for (int j = 0; j < s.length(); ++j) {
            for (int i = 0; i < j; ++i) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    if (j - i < 3 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;

                        if (j - i + 1 > maxLen) {
                            maxLen = j- i + 1;
                            start = i;
                        }
                    }
                }
            }
        }

        return sb.substring(start, start + maxLen);
    }
}

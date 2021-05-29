package com.zsw.algorithm.twoPointers;

import java.util.LinkedList;
import java.util.List;

/**
 * 无重复字符的最长子串
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new LinkedList<>();
        int left = 0, right = 0;
        int max = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            while (left < right && list.contains(c)) {
                list.remove(0);
                left++;
            }
            if (right - left + 1> max) {
                max = right - left + 1;
            }
            list.add(c);
            right++;
        }

        return max;
    }

    public static void main(String[] args) {
        int res = new LengthOfLongestSubstring().lengthOfLongestSubstring("pwwkew");
        System.out.println(res);
    }
}

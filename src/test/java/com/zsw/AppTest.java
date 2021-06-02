package com.zsw;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 一些测试代码
 * @author zsw
 * @date 2021/4/5
 */
public class AppTest {

    @Test
    public void test1() {
        System.out.println("Hello, world!");
    }

    @Test
    public void testSort() {
        System.out.println(firstUniqChar("loveleetcode"));
    }
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char a : s.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); ++i) {
            if (map.get(s.charAt(i)) == 1) {
                if (min > i) {
                    min = i;
                }
            }
        }
        return min;
    }

}

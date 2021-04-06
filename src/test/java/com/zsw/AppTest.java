package com.zsw;

import com.zsw.algorithm.sort.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = new int[]{1, 2, -7, 657, 0};
        bubbleSort.bubbleSort(arr);
        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    }
}

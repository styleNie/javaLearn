package com.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2016/10/17.
 * 查找 List 中的最大最小值
 */
public class ListMaxMin {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println(list);
        System.out.println("最大值: " + Collections.max(list));
        System.out.println("最小值: " + Collections.min(list));
    }
}

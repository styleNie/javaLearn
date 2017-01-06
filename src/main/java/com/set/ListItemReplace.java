package com.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2016/10/17.
 * List 元素替换
 */
public class ListItemReplace {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List :"+list);
        Collections.replaceAll(list, "one", "hundread");
        System.out.println("replaceAll: " + list);
    }
}

package com.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2016/10/17.
 * List 截取
 */
public class GetSubList {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List :"+list);
        List sublist = Arrays.asList("three Four".split(" "));
        System.out.println("子列表 :"+sublist);
        System.out.println("indexOfSubList: " + Collections.indexOfSubList(list, sublist));
        System.out.println("lastIndexOfSubList: " + Collections.lastIndexOfSubList(list, sublist));
    }
}

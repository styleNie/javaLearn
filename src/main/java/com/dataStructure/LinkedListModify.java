package com.dataStructure;

import java.util.LinkedList;

/**
 * Created by Administrator on 2016/10/17.
 * 链表修改
 */
public class LinkedListModify {
    public static void main(String[] a) {
        LinkedList officers = new LinkedList();
        officers.add("B");
        officers.add("B");
        officers.add("T");
        officers.add("H");
        officers.add("P");
        System.out.println(officers);
        officers.set(2, "M");
        System.out.println(officers);
    }
}

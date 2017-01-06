package com.dataStructure;

import java.util.LinkedList;

/**
 * Created by Administrator on 2016/10/17.
 * 在链表（LinkedList）的开头和结尾添加元素
 */
public class LinkedListItem {
    public static void main(String[] args) {
        LinkedList lList = new LinkedList();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        System.out.println(lList);
        lList.addFirst("0");
        System.out.println(lList);
        lList.addLast("6");
        System.out.println(lList);
    }
}

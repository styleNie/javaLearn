package com.dataStructure;

import java.util.LinkedList;

/**
 * Created by Administrator on 2016/10/17.
 * 获取链表（LinkedList）的第一个和最后一个元素
 */
public class LinkedListGetItem {
    public static void main(String[] args) {
        LinkedList lList = new LinkedList();
        lList.add("100");
        lList.add("200");
        lList.add("300");
        lList.add("400");
        lList.add("500");
        System.out.println("链表的第一个元素是：" + lList.getFirst());
        System.out.println("链表的第二个元素是：" + lList.getLast());
    }
}

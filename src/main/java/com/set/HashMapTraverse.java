package com.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/10/17.
 * HashMap遍历
 */
public class HashMapTraverse {
    public static void main(String[] args) {
        HashMap< String, String> hMap = new HashMap< String, String>();
        hMap.put("1", "1st");
        hMap.put("2", "2nd");
        hMap.put("3", "3rd");
        Collection cl = hMap.values();
        Iterator itr = cl.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

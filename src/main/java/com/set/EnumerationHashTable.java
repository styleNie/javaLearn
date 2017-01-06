package com.set;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by Administrator on 2016/10/17.
 */
public class EnumerationHashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");
        Enumeration e = ht.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}

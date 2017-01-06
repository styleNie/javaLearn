package com.dataStructure;

import java.util.Collections;
import java.util.Vector;

/**
 * Created by Administrator on 2016/10/17.
 * 获取向量元素的索引值
 */
public class VectorIndex {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("X");
        v.add("M");
        v.add("D");
        v.add("A");
        v.add("O");
        Collections.sort(v);
        System.out.println(v);
        int index = Collections.binarySearch(v, "D");
        System.out.println("元素索引值为 : " + index);
    }
}

package com.dataStructure;

import java.util.Collections;
import java.util.Vector;

/**
 * Created by Administrator on 2016/10/17.
 * 获取向量的最大元素
 */
public class GetVectorMax {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(new Double("3.4324"));
        v.add(new Double("3.3532"));
        v.add(new Double("3.342"));
        v.add(new Double("3.349"));
        v.add(new Double("2.3"));
        Object obj = Collections.max(v);
        System.out.println("最大元素是："+obj);
    }
}
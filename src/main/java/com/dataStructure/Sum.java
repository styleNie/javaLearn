package com.dataStructure;

/**
 * Created by Administrator on 2016/10/17.
 * 数字求和运算
 */
public class Sum {
    public static void main(String[] args) {
        int limit=100;
        int sum=0;
        int i=1;
        do
        {
            sum=sum+i;
            i++;
        }
        while(i<=limit);
        System.out.println("sum="+sum);
    }
}

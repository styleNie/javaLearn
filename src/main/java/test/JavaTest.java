package test;

import java.lang.Number;
import java.util.Arrays;
import java.util.Random;
import java.util.Comparator;
/**
 * Created by Administrator on 2016/10/10.
 */
public class JavaTest {
    public static void main(String[] args){
        Integer[] arr =new Integer[10];
        Random rand = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = rand.nextInt(20);
        }
        for(Integer elem:arr){
            System.out.printf("%d ",elem);
        }
        System.out.println();
        Arrays.sort(arr,new Comparator<Integer>(){
            public int compare(Integer a, Integer b){return b-a;}
        });
        for(Integer elem:arr){
            System.out.printf("%d ",elem);
        }
        System.out.printf("\n%d",Arrays.binarySearch(arr,18));//二分查找的数组必须是从小到大排好序
    }
}

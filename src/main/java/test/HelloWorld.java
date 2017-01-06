package test;

/**
 * Created by Administrator on 2016/10/8.
 */
class MyClass {
    int x;

    // 以下是构造函数
    MyClass(int i) {
        x = i;
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(20);
        System.out.println(t1.x + " " + t2.x);
    }
}

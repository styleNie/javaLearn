package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by Administrator on 2016/10/10.
 */
public class BRRead {
    public static void main(String args[]) throws IOException
    {
        char c;
        String str;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");
        // 读取字符
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        } while(c != 'q');
        do{
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("end"));
    }
}

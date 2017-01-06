package test;

import java.util.Date;
import java.util.Calendar;
import java.text.*;

/**
 * http://www.runoob.com/java/java-date-time.html
 */
public class DateDemo {
    public static void main(String args[]) {

//        Date dNow = new Date( );
//        SimpleDateFormat ft = new SimpleDateFormat ("E　yyyy.MM.dd 'at' hh:mm:ss a　zzz");
//
//        System.out.println("Current Date: " + ft.format(dNow));
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.MONTH));
        c.add(Calendar.DATE,25);
        System.out.println(c.get(Calendar.MONTH));
    }
}
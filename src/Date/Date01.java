package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        System.out.println(System.currentTimeMillis());


        System.out.println("-----------------");
        //将定义格式的字符串型时间转换为日期型，按照日期型格式输出
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = simpleDateFormat.parse("2018-11-30 11:13:13");
        System.out.println(date1);
        System.out.println("-----------------");

        //将日期型日期转换为字符串类型，按照设定的格式输出
        String string =simpleDateFormat.format(date);
        System.out.println(string);

        //输出java.sql.Date类型时间，需要传入currentTimeMillis+L
        System.out.println("-----------------");
        java.sql.Date date2 = new java.sql.Date(1543548025965L);
        System.out.println(date2);
    }
}

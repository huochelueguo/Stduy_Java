package Date;


import java.util.Calendar;

public class Calender01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println("---------------------");

        calendar.set(Calendar.YEAR,2020);
        calendar.set(Calendar.DATE,-10);
        System.out.println(calendar);
        System.out.println("---------------------");

        //Calender 的get方法，month需要加1
        int a = calendar.get(Calendar.YEAR);
        int b = calendar.get(Calendar.MONTH);
        int c = calendar.get(Calendar.DATE);
        System.out.println(a+"/"+(b+1)+"/"+c);




    }


}

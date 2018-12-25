package FatherSon;

public class Person {
    public static void main(String[] args) {
        Father f = new Father();
        f.age = 55;
        f.high = 165;
        f.name = "sun";
       /*f.a();
        f.b();
        f.c();*/
        Father f2 = new Father(10,16.5);



        Son s = new Son();
        s.a = 25;
        s.b = 172;
        s.name = "sunsun ";
        s.school = "HRB";
        s.a();
        /*s.b();
        s.c();*/
        s.school();
    }
}

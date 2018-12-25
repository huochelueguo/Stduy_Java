package DuiXiang_practice.Rectangle;

public class Circle {
    private  double banjing;

    public Circle() {
    }

    public Circle(double banjing) {
        this.banjing = banjing;
    }

    public double getBanjing() {
        return banjing;
    }

    public void setBanjing(double banjing) {
        this.banjing = banjing;
    }
    public double zhouchang(double banjing){
        double zhouchang ;
        zhouchang = 3.14*2*banjing;
        return  zhouchang;
    }
    public double mianji(double banjing){
        double mianji;
        mianji = 3.14*banjing*banjing;
        return  mianji;
    }
}

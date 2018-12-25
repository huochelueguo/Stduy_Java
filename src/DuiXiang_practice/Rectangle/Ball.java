package DuiXiang_practice.Rectangle;

public class Ball extends Circle {
    public double mianji(double banjing){
        double mianji;
        float f;
        mianji = 4/3.0*3.14*banjing*banjing*banjing;
                return  mianji;
    }                   //重写父类方法

    public double tiji(double banjing){
        double tiji;
        tiji = 3.14*banjing*banjing*banjing*1.33;
        return  tiji;
    }
}

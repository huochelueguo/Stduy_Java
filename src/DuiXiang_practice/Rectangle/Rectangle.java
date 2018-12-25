package DuiXiang_practice.Rectangle;

public  class Rectangle {
    int Kuan;
    int Gao;

    public Rectangle() {
        this.Gao = 1;
        this.Kuan = 1;
    }
    public Rectangle(int c){
        this.Kuan = c;
        this.Gao = c;
    }
    public Rectangle(int d, int e ){
        this.Kuan = d;
        this.Gao = e;
    }
    public int Zhouchang( ){
        int zhouchang;
        zhouchang = (this.Kuan*2)+(this.Gao*2);
        return  zhouchang;
    }
    public int Mianji (){
        int mianji;
        mianji = this.Kuan*this.Gao;
        return mianji;

    }
    //abstract int a();

}

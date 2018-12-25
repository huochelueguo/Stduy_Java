public class add3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <200 ; i++) {
            if (i%3 == 0){
                //System.out.println(i);
                sum = sum+i;
            }
        }System.out.println(sum);
    }
}
//计算 1~200 之间所有 3 的倍数之和
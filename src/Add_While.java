public class Add_While {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while ( i<201){
            if (i%3 == 0){
                sum =sum +i;
            }i++;
        }
        System.out.println(sum);
    }
}
///用 while 循环，计算 1~200 之间所有 3 的倍数之和。
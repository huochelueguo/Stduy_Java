package String;

public class String01 {
    public static void main(String[] args) {
        String string = "用核心每一步";
        int a = string.length();
        System.out.println(a);

        try {
            System.out.println(string.charAt(9));
        }catch (StringIndexOutOfBoundsException ex){
            System.out.println("数组下标越界");
        }
        finally {
            string.replace("一","二");
            System.out.println(string);
            System.out.println( string.replace("一","二"));
        }


            string.replace("一","二");
            System.out.println(string);
            System.out.println( string.replace("一","二"));


    }
}

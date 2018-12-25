package File;
import java.io.File;
//递归方法输出文件夹所有文件路径
public class DiGui {
    public static void main(String[] args) {
        File file = new File("F:\\Train\\W文件");
        //System.out.println(file);
        digui(file);
    }

    public static void digui(File f){
        File[] files;
        files = f.listFiles();
        for (File fs: files) {//fs可能是文件，也可能是文件夹
            System.out.println(fs);

            if (fs.isDirectory()){
                    digui(fs);   //递归，如果是文件夹，将遍历对象再次遍历
            }
        }


    }
}

package File;
import java.io.File;
//递归输出所有文件夹名称
public class DiGui01 {
    public static void main(String[] args) {
        File file = new File("F:\\Train\\W文件");
        digui(file,1);
    }

    public static void digui(File f,int lever){
        File[] files = f.listFiles();

        for (File fs:files
                ) {
            for (int i = 0; i <lever; i++) {
                System.out.print("-");
            }                                   //根据文件夹所在级数，输出对应-，使输出文件顺序清晰
            System.out.println(fs.getName());
            if (fs.isDirectory()){
                digui(fs,lever+1);      //递归查询
            }
        }
    }

}

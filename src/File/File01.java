package File;

import java.io.File;
import java.io.IOException;

public class File01
{
    public static void main(String[] args) throws IOException {
        File file =new File("F:\\TEST.txt");

        System.out.println(file.exists());
        System.out.println(file);
        /*if (file.exists()){
            file.delete();
        }else file.createNewFile();
   */
    }
}

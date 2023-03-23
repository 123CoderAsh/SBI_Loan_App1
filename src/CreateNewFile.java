import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) throws IOException {
       /* File f = new File("Ashish.txt");
       boolean f1status =  f.createNewFile();
        System.out.println(f1status);
        boolean f1 = f.canWrite();
        boolean fstatus = f.canWrite();
        System.out.println("Ashish is the best Coder in the world");*/

        File f = new File ("D:\\Java Project\\File Handling");
        boolean f1status = f.createNewFile();
        System.out.println(f1status);


    }
}

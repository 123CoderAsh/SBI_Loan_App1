import java.io.File;

public class List {
    public static void main(String[] args) {
        File f = new File("D:\\");
        String[] arr = f.list();

        for(String name : arr){
            System.out.println(name);
        }

    }
}

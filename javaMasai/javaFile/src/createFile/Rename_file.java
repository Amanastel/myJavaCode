package createFile;

import java.io.File;

public class Rename_file {
    public static void main(String[] args) {
        File f = new File("A.text");
        File r = new File("Aman.text");

        if(f.exists()){
            System.out.println(f.renameTo(r));
        }else {
            System.out.println("file is not present");
        }
    }
}

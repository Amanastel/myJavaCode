package createFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File f = new File("A.text");

//        FileWriter
        try {
            if(f.createNewFile()){
                System.out.println("file Successfully created..!");

            }else {
                System.out.println("file already exist..!");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

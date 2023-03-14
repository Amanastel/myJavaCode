package createFile;

import java.io.FileReader;
import java.io.IOException;

public class File_reader {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader("A.text");
            try {
                int i;
                while((i=r.read())!= -1){
                    System.out.print((char) i);
                }
            }finally {
                r.close();
            }
        }catch (IOException e){
            System.out.println(e);
//            e.printStackTrace();
        }
    }
}

package createFile;

//import java.io.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_file {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("Aman.text");
        FileOutputStream w = new FileOutputStream("astelll.text");

        int i;
        while ((i=f.read()) != -1){
            w.write((char)i);
        }
        System.out.println("Data copied Successfully");
    }
}

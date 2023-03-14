package createFile;

//import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class FileWri {
    public static void main(String[] args)  {
//
        try {
            FileWriter f = new FileWriter("we.test");
            try {
                f.write("Java Programming is tge best Language..!");
            }finally {
                f.close();
            }
            System.out.println("Successfully Data wrote in file..!");
        }catch (IOException e){
            System.out.println(e);
//            e.printStackTrace();
        }



        // if we can handhold Exception
//        FileWriter f = new FileWriter("we.test");
//        f.write("Java Programming is tge best Language..!");
//        System.out.println("Successfully Data wrote in file..!");
    }
}

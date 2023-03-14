package createFile;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File f = new File("A.text");
        if(f.exists()){
            System.out.println("File name: "+f.getName());
            System.out.println("File Location: "+ f.getAbsoluteFile());
            System.out.println("File Writable: "+ f.canWrite());
            System.out.println("File Readable: "+ f.canRead());
            System.out.println("File Size: "+ f.length());
            System.out.println("File Removed: "+ f.delete());
        }else{
            System.out.println("File doesn't Exists..!");
        }
    }
}

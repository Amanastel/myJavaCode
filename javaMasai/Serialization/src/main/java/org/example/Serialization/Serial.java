package org.example.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) throws IOException {
        Student student = new Student("Aman Kumar", 20, "Kanpur", "0123456789");
        FileOutputStream fileOutputStream = new FileOutputStream("student.txt");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("Object State is transferred to student.txt file successfully.");




    }
}

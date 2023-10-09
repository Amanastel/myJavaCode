package org.example.Serialization;

import java.io.*;

public class Deserialize {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("student.txt");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        try {
            Student student = (Student) objectInputStream.readObject();
            student.printInfo();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        objectInputStream.close();
        fileInputStream.close();


    }
}

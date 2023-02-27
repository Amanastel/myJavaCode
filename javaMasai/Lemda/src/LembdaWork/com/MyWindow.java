package LembdaWork.com;

import javax.swing.*;
import java.awt.*;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click me !!");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(button);
    }
}

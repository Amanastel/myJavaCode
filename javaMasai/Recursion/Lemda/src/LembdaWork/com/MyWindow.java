package LembdaWork.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My window");
//        frame.setSize(400,400);
//        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click me !!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button click");
                JOptionPane.showMessageDialog(null,"hey button click");
            }
        });
        button.addActionListener((ActionEvent e)->{
            System.out.println("Button click");
            JOptionPane.showMessageDialog(null,"hey button click");
        });
        button.addActionListener( e -> {
            System.out.println("Button click");
            JOptionPane.showMessageDialog(null,"hey button click");
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(button);
    }
}

package GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
//        JFrame frame = new JFrame(); new ta cm dong nay thi phai doi frame thanh con tro this
        this.setTitle("huyhuy");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);// ko the resize
        this.setSize(500, 500);
        this.setVisible(true);// make this visible
        ImageIcon image = new ImageIcon("D:\\java\\49.GUI\\images.jpg");//tao image icon
        this.setIconImage(image.getImage());//change icon of this
//        this.getContentPane().setBackground(Color.cyan);//thay doi may cua backround
        this.getContentPane().setBackground(new Color(20, 30, 50));//rgb color
    }
}
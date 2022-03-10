import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //flow layout dai kahi la may thu minh hien thi tren 1 dong
        //  neo ko du do rong thi se tu dong chuyen xuong dong tiep theode hien thi

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        // Flowlayout.Leading tu dong chuyen hang vao xep theo thu tu trai qua phai
        // neo de mac dinh no se de vi tri le vao center
        // neu .Trailing no se stick het sang ben phai
        // hoac ta co the cho ve center va set toa do

        
        // ta se cho cac button vao trong panel sau do cmt frame.add lai
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,100));// w la do rong h la do dai
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());// nho nhet cai nay vao thi moi hien nha

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        
        
        
        
        
//
//        frame.add(new JButton("1"));
//        frame.add(new JButton("2"));
//        frame.add(new JButton("3"));
//        frame.add(new JButton("4"));
//        frame.add(new JButton("5"));
//        frame.add(new JButton("6"));
//        frame.add(new JButton("7"));
//        frame.add(new JButton("8"));
//        frame.add(new JButton("9"));



        frame.add(panel);// them cai nay moi hien panel nha
        frame.setVisible(true);

    }
}

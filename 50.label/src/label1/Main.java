// JLable = a Gui display area for a string of text, image ....
package label1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JLabel label = new JLabel();// create a label
        ImageIcon image = new ImageIcon("D:\\java\\50.label\\src\\label1\\haiu.png");
        Border border = BorderFactory.createLineBorder(Color.CYAN,10);// ham goi vien bg mau va do rong

        label.setText("--------------------------------Alo, dang o dau vay?------------------------------------");// set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);// set text o vi tri giua or any where image
        label.setVerticalTextPosition(JLabel.EAST);// set text o duoi nhung giua anh
        label.setForeground(new Color(199, 18, 139));// set mau cho text
        label.setFont(new Font("new",Font.ITALIC,20));// set font cua text na co chu
        label.setIconTextGap(50);// set do xa giua image va test
        label.setBackground(new Color(49, 58, 94)); // set background color but
        label.setOpaque(true); // can cai nay true thi background color moi hien :))// false thi deo co gi say ra
        label.setBorder(border);// goi ham tao vien bg
        label.setVerticalAlignment(JLabel.CENTER); // set lable ve top bot center(text+image) theo phuong doc
        label.setHorizontalAlignment(JLabel.CENTER);// tuong tu tren theo phuong ngang
       // label.setBounds(100,100,800,800);// bo sung cho setlayout ta set toa do va do to




        JFrame frame = new JFrame();
//        frame.setTitle("huyhuy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);// ko the resize
      //  frame.setLayout(null);
       // frame.setSize(1000,1000);//layout se trang. neu muon hien layel thi them label.setbounds
        frame.add(label);
        frame.setVisible(true);
        frame.pack();// auto resize frame
    }
}

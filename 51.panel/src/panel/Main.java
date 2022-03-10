package panel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("D:\\java\\51.panel\\src\\panel\\icon2.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);


        // cai dong nay chi goi dc khi set greenpanel.setLayout(new BorderLayout());
//        label.setVerticalAlignment(JLabel.CENTER);
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setHorizontalTextPosition(JLabel.CENTER);// set text o vi tri giua or any where image
//        label.setVerticalTextPosition(JLabel.EAST);
        // hoac ta co the set toa do tu do cua label trong panel bang cach
        // goi lenh redpanel.setLayout(null); tuong tu voi blue green sau do  goi
        label.setBounds(100,100,250,250);// neu dung cai nay thì sethorizon va vertical ko can nua

        JPanel redpanel =new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);
        redpanel.setLayout(null);

        JPanel bluepanel =new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);
        bluepanel.setLayout(null);
        JPanel greenpanel =new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500,250);
        greenpanel.setLayout(new BorderLayout());
        greenpanel.setLayout(null);






                JFrame frame = new JFrame();

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);// ko the resize
                frame.setLayout(null);
                frame.setSize(750,750);//layout se trang. neu muon hien layel thi them label.setbounds
                frame.setVisible(true);
                greenpanel.add(label);
//                bluepanel.add(label);
//                redpanel.add(label);
                frame.add(redpanel);// add panel vao frame
                frame.add(bluepanel);
                frame.add(greenpanel);

//                frame.add(label);
    }
}

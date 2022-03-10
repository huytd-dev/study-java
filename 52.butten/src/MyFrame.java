import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    MyFrame() {
        ImageIcon icon = new ImageIcon("D:\\java\\51.panel\\src\\panel\\icon2.png");
        ImageIcon icon2 = new ImageIcon("D:\\java\\52.butten\\src\\bangcanhan.png");

        label = new JLabel();// goi label
        label.setIcon(icon2);// set icon label
        label.setBounds(200,250,150,150);// set vi tri
        label.setVisible(false);// net de true thi se hien luon ko can click




        button = new JButton();
        button.setBounds(150, 100, 200, 75);
        button.addActionListener(this);//or (e -> System.out.println("haha")
        // neu set chu ma tran chu thi phat set lai bounds
        button.setText("i'm button!");// set chu tren button
        button.setFocusable(false);
        button.setIcon(icon);// goi icon vao button
        button.setHorizontalTextPosition(JButton.CENTER);// set chu o giua button
        button.setVerticalTextPosition(JButton.BOTTOM);// set chu o phan duoi button
        button.setFont(new Font("settext",Font.BOLD,25));
        button.setIconTextGap(0); // set do gan xa cua chu voi icon hay qq gi do chua ro alm
        button.setForeground(Color.gray);// set chu cho text
        button.setBackground(Color.orange);
        button.setBorder(BorderFactory.createEtchedBorder());// lam khung 3d cho button
       // button.setEnabled(false);// KO BAM DC DUA XUONG OVERIDER


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {// dua button ra ngoai frame
           System.out.println("I'm hearbearker");// button.addActionListener(this);
          //  button.setEnabled(false);// JUST only1 click tuy tinh huong ta sai
        label.setVisible(true);
        }
    }
}

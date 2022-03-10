import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MyFrame extends JFrame implements KeyListener{

    JLabel label;
    ImageIcon imageIcon;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setTitle("rocket");
        this.addKeyListener( this);

        imageIcon = new ImageIcon("D:\\download\\rocket.png");

        label = new JLabel();
        label.setBounds(0,0,128,128);
        label.setText("^^");
        label.setIcon(imageIcon);
//        label.setBackground(Color.RED);
//        label.setOpaque(true);
        this.getContentPane().setBackground(Color.cyan);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){

//            neu dung e.getKeyChar thi dung a s d w
            case 'a': label.setLocation(label.getX()-1, label.getY());
            break;
            case 's': label.setLocation(label.getX(), label.getY()+1);
            break;
            case 'd': label.setLocation(label.getX()+1, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-1);
                break;

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("you released key char: "+ e.getKeyChar());
        // dong tren in ra chu ta nhap dong duoi inra so code cua chu ta nhap vd a =65 b = 66
        System.out.println("you released key char: "+ e.getKeyCode());
    }
}

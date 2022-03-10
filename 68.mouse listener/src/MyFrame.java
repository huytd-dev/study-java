import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setOpaque(true);
        label.addMouseListener(this);
        label.setBackground(Color.DARK_GRAY);


        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("you click the mouse");
        label.setBackground(Color.RED);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("you press the mouse");
        label.setBackground(Color.BLUE);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("you relea the mouse");
        label.setBackground(Color.CYAN);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("your mouse enter the label");
        label.setBackground(Color.ORANGE);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("your mouse exit the label");
        label.setBackground(Color.WHITE);

    }
}

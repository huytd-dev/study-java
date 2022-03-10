import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyPanel panel;
    MyFrame(){
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.pack(); //dua ve cua so thu nho cua ct.

        this.setVisible(true);

    }


}

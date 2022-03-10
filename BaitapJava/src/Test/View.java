package Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton nutchuyen;
    private JLabel dofLabel;

    public View(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setContentPane(mainPanel);
        this.pack();


        nutchuyen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr = (int)((Double.parseDouble(textField1.getText()))*1.8+32);
                dofLabel.setText(tempFahr + " do F");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new View("testview");
        frame.setVisible(true);
    }
}

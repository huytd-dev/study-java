import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        checkIcon = new ImageIcon("D:\\download\\oke.png");
        xIcon = new ImageIcon("D:\\download\\cancle.png");

         button = new JButton();
        button.setText("nhanvao!");
        button.addActionListener(this);


        checkBox = new JCheckBox();// goi checkbox
        checkBox.setText("i'm not robot");// set chu cho checkbox
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("conslas",Font.PLAIN,30));
        checkBox.setIcon(xIcon);// thay doi nut tich thanh v va x
        checkBox.setSelectedIcon(checkIcon);


        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }





    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected());// tra ve true or false
        }
    }
}

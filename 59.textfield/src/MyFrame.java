import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    // tao 1 struct Myframe
    // khai bao Jbutton cho override
    JButton button;
    JTextField textField;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Nhan vao!");// tao nut
        button.addActionListener(this);// cho button nhan gia tri xong gan vao this

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));// tao kich thuoc
        textField.setFont(new Font("deobiet",Font.PLAIN,25));// set font
        textField.setForeground(new Color(111, 196, 44));// set mau chu
        textField.setBackground(new Color(23,24,2));// set backgruond chu
        textField.setCaretColor(Color.WHITE);// set mau cho dau nhay'
        textField.setText("Nhapvaoday!");// set chu mac dinh khi hien box
//        textField.setEditable(false);// neu co cai nay ta se ko edit chu de nhap vao dc


        this.add(button);
        this.add(textField);// goi textfield vao frame
        this.pack();
        this.setVisible(true);
        //this la thay cho frame
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){
            // o day say ra 1 vd la button ko goi dc . ta khai bao button thanh global
            // tuong tu voi textfield
          System.out.println("xinchao"+textField.getText());
          button.setEnabled(false);// nhap 1 lan la ko dc nua// neu thich thi goi luon thang set.Editable de khoi nhap
            textField.setEditable(false);

        }
    }
}

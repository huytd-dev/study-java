import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        String[] animals = {"dog", "cat", "mouse"};// cos the interger double ...
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

//        comboBox.setEditable(true);// neu nhap dung thi no se in ra gia tri ten or index
//        System.out.println(comboBox.getItemCount());// dem so item co trong bocx
//        comboBox.addItem("Fish");// them item vao trong box
//           comboBox.insertItemAt("pig", 1); // add item va vi tri
//        comboBox.setSelectedIndex(2);// dua vi tri thu 2 len hien thi khi goi box
//        comboBox.removeItem(1);// remove 1 == pig moi them vao
        comboBox.removeAllItems();// remove toan bo se in ra null


        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());// in ra ten
//            System.out.println(comboBox.getSelectedIndex());// in ra thu tu  0 1 2
        }
    }
}

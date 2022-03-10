import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
                    // this o day tuong ung voi myframe
         button = new JButton("Select the file");
        button.addActionListener(this);
        this.add(button);
        this.pack();
        this.setVisible(true);


    }






    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));// chi dinh den thu muc dang lam viec
        //    fileChooser.showOpenDialog(null);// select file to open
           // System.out.println(fileChooser.showOpenDialog(null));
//            int response = fileChooser.showOpenDialog(null);// chon file de mo
            int response = fileChooser.showSaveDialog(null); //chon file de save
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);// in ra duong dan file
            }
        }
    }
}


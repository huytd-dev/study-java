import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton myButton = new JButton("new window");

    // tao 1 struct launpage
    LaunchPage(){

        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener((ActionListener) this);

        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==myButton){
            frame.dispose();// them lenh nay thi chi mo them dc 1 cua so neu ko mo dc ca dong
            NewWindow myWindow = new NewWindow();
        }

    }
}

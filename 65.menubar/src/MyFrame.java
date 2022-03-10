import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    JMenuItem findItem;
    JMenuItem tipItem;
    JMenuItem checkItem;

    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("D:\\download\\loadicon.png");
        saveIcon = new ImageIcon("D:\\download\\saveicon.png");
        exitIcon = new ImageIcon("D:\\download\\exiticon.png");

         menuBar = new JMenuBar();
         fileMenu = new JMenu("File");
         editMenu = new JMenu("Edit");
         helpMenu = new JMenu("Help");

         loadItem = new JMenuItem("Load");
         saveItem = new JMenuItem("Save");
         exitItem = new JMenuItem("Exit");

        findItem = new JMenuItem("Find");
        tipItem = new JMenuItem("Tip of the day");
        checkItem = new JMenuItem("Check for update");


        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);


        fileMenu.setMnemonic(KeyEvent.VK_F); // alt F
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        loadItem.setMnemonic(KeyEvent.VK_L); // l
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        findItem.setMnemonic(KeyEvent.VK_F);
        tipItem.setMnemonic(KeyEvent.VK_T);
        checkItem.setMnemonic(KeyEvent.VK_C);


        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        helpMenu.add(findItem);
        helpMenu.add(tipItem);
        helpMenu.add(checkItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }













    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadItem){
            System.out.println("beep beep! you loaded the file");
        }
        if(e.getSource()==saveItem){
            System.out.println("beep beep! you save the file");

        }
        if(e.getSource()==exitItem){
            System.out.println("good bye");
            System.exit(0);

        }
    }
}

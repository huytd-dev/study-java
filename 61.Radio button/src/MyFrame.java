import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdotButton;

    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;

    MyFrame(){
        this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon = new ImageIcon("D:\\download\\pizza.png");
        hamburgerIcon = new ImageIcon("D:\\download\\hamburger.png");
        hotdogIcon = new ImageIcon("D:\\download\\hotdog.png");

         pizzaButton = new JRadioButton("pizza");
         hamburgerButton = new JRadioButton("hamburger");
         hotdotButton = new JRadioButton("hotdot");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdotButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdotButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdotButton.setIcon(hotdogIcon);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdotButton);

        this.pack();
        this.setVisible(true);
    }








    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==pizzaButton){
                System.out.println("U ordered pizza");
            }else if(e.getSource()==hamburgerButton){
                System.out.println("U ordered hamburger");
            }else if(e.getSource()==hotdotButton){
                System.out.println("U ordered hotdot");

            }
    }
}

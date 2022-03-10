import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HIGHT = 500;

    Image rocket;
    Image backgroundImage;
    Timer timer;
    int yVelocity = 4;
    int xVelocity = 2;


    int x = 0;
    int y = 0;

    MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HIGHT));
        this.setBackground(Color.DARK_GRAY);
        backgroundImage = new ImageIcon("D:\\java\\71+\\73.2D animation\\space.jpg").getImage();
        rocket = new ImageIcon("D:\\java\\71+\\73.2D animation\\rocket.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g){
        super.paint(g);// ve lai bg cua class cha

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backgroundImage,0,0,null);
        g2D.drawImage(rocket,x,y,null);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>=PANEL_WIDTH-rocket.getWidth(null) || x <0){// chong chay qua vien
            xVelocity = xVelocity *-1;//neu di chuyen den max x thi dao chieu
        }
        x = x+ xVelocity;
        if(y>=PANEL_HIGHT-rocket.getHeight(null) || y <0){// chong chay qua vien
            yVelocity = yVelocity *-1;//neu di chuyen den max x thi dao chieu
        }
        y = y+ yVelocity;
        repaint();
    }
}

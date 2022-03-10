import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Image image ;


    MyPanel(){
        this.setPreferredSize(new Dimension(500,500));
        image = new ImageIcon("C:\\Users\\84169\\Desktop\\heartbre.png").getImage();
    }
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(image,0,0,null);

        g2D.setPaint(Color.GREEN);
        g2D.setStroke(new BasicStroke(5));// set do day cua line
        g2D.drawLine(0,0,700,700);// x1 y1 x2 y2 ve duong cheo




        g2D.setPaint(Color.blue);
        g2D.drawRect(0,0,100,200);// ve hinh chu nhat or vuong

        g2D.setPaint(Color.pink);
        g2D.fillRect(0,0,100,100);// to mau trong hinh

        g2D.setPaint(Color.orange);
        g2D.drawOval(400,400,100,100);

        g2D.setPaint(Color.red);
        g2D.fillOval(400,400,50,50);


        g2D.setPaint(Color.CYAN);
        g2D.drawArc(300,300,200,200,0,270);
        g2D.fillArc(300,300,200,200,0,270);

        int[] xPoints ={150,250,350};
        int[] yPoints ={300,150,300};


        g2D.drawPolygon(xPoints,yPoints,3);
        g2D.fillPolygon(xPoints,yPoints,3);


        g2D.setFont(new Font("boo",Font.PLAIN,50));
        g2D.drawString("Artis",150, 450);







    }
}

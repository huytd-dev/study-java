import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();// set tien trinh nguoc (0,500)

    ProgressBarDemo(){

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("boli",Font.BOLD, 25));// set chu chay
        bar.setForeground(Color.CYAN);
        bar.setBackground(Color.BLACK);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);

        frame.setLayout(null);
        frame.setVisible(true);

        fill();// tao 1 ham fill de tang tien trinh

    }

    public  void fill(){
        int counter = 0;// set tien trinh nguoc dat (500)

        while (counter<=100){// nguoc thi dat  >0
            bar.setValue(counter);
            try {
                Thread.sleep(100);// toc do tnag tien trinh
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            counter +=5;// cu moi lan tang tien tirnh laf +5, nguoc thi -=5
        }
        bar.setString("Done! :)");// thoat while tuc la xong cv in ra done
        System.out.println("xong viec r do ml");
    }

}

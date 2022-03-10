import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {
    //Lớp JSlider trong Java Swing được sử dụng để tạo con trượt slider.
    // Bởi sử dụng JSlider, một người dùng có thể lựa chọn một giá trị
    // từ một dãy cụ thể.
   JFrame frame;
   JPanel panel;
   JLabel label;
   JSlider slider;

    SliderDemo(){
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);// set min anh max value bat dau la 50

        slider.setPreferredSize(new Dimension(420,200));

        slider.setPaintTicks(true);// 2 dong nay la them thuoc gia tri 10
        slider.setMinorTickSpacing(5);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(10);// them thuoc to

        slider.setPaintLabels(true); // them gia tri thuoc
        slider.setFont(new Font("aibiet",Font.ITALIC,20));

        slider.setOrientation(SwingConstants.NORTH);// doi thuoc thanh doc ngang or ...

        label.setText("ºC = "+ slider.getValue()); //dua xuong duoi overdie moi thay doi gia tri dc
        label.setFont(new Font("aibiet",Font.PLAIN,35));

        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);

        frame.add(panel);

        frame.setSize(420,420);
        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("ºC = "+ slider.getValue());
    }
}

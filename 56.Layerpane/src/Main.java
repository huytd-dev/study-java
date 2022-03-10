import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
// JLayeredPane thêm chiều sâu cho một thùng chứa JFC / Swing,
// cho phép các thành phần chồng lên nhau khi cần thiết. Một đối tượng Integer chỉ định độ sâu của từng thành phần trong vùng chứa, nơi các thành phần được đánh số cao hơn nằm 'trên cùng' các thành phần khác. Để biết tài liệu hướng tác vụ và
// ví dụ về cách sử dụng ngăn xếp lớp
// , hãy xem Cách sử dụng ngăn xếp lớp, một phần trong Hướng dẫn sử dụng Java
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.GREEN);
        label3.setBounds(150,150,200,200);


        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

//        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
//        layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
//        layeredPane.add(label3, JLayeredPane.DRAG_LAYER);
        // thu tu red blue green
        // ney them defau-defau-drag thu tu xanh do xanh la
        // ta co cac
     /*   DEFAULT_LAYER  PALETTE_LAYER  MODAL_LAYER POPUP_LAYER DRAG_LAYER
         hoac ta co the set vi tri bang interger 0 , 1 , 2 ....
        */
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(1));


        JFrame frame = new JFrame("JLayerPane");// tao frame va set name

        frame.add(layeredPane);// add layerpane vao frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

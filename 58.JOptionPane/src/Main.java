import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Lớp JOptionPane trong Java Swing là một thành phần cung cấp các phương thức chuẩn
        // để gọi một hộp thoại dialog chuẩn cho một giá trị hoặc thông báo người dùng
        // về một cái gì đó.
//        JOptionPane.showMessageDialog(null,"this is some useless info","title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"this is some useless info","title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"really","title",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"goi tro giup nhau","title",JOptionPane.ERROR_MESSAGE);
     //   while (true) {} neu dung lenh while true thi nhan hoai ko het :)) treu khi diet virus
//            JOptionPane.showMessageDialog(null, "may tinh cua ban co virrus", "title", JOptionPane.WARNING_MESSAGE);

        // plain and infomation thi gan giong nhau, Question thi co dau ? error thi co dau X kieu canh bao// wraning thi co dau !
            // dong duoi nay dua ra 3 nut de lua chon
    //JOptionPane.showConfirmDialog(null,"huy ban da bao h code","title",JOptionPane.YES_NO_CANCEL_OPTION);
      //  hoac ta co the nhap ten vao roi xuat ra nhu sau
//        String name =  JOptionPane.showInputDialog("what is your name");
//        System.out.println("hello "+name);// colsole se hien hello huy
        String[] ketqua ={"deo' xau bo me","camon","brukkk"};// thay cho yes , no , cancel ko thi de null
        ImageIcon icon = new ImageIcon("D:\\download\\bangcanhan.png");// them icon vao neu ko de null
        JOptionPane.showOptionDialog(null,
                "ban that dep trai",
                "bimat do",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                ketqua,
                0);
    }
}
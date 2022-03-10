import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("enteryourname");
        JOptionPane.showMessageDialog(null, "hello"+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age : "));
        JOptionPane.showMessageDialog(null, "you are "+age);
        double height = Double.parseDouble(JOptionPane.showInputDialog("enter your h "));
        JOptionPane.showMessageDialog(null, "you are "+height+" m");

    }
    
}

import javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer;

public class statickey {
    //static = modifier.a single coppy of variable/method is created and sahe
    //          the class"owns" the static member

    public static void main(String[] args) {
        Friend frined1 = new Friend("huy");
        Friend frined3 = new Friend("hung");
        Friend frined2 = new Friend("hai");

        // System.out.println(frined1.numberoffriend);
        System.out.println(Friend.numberoffriend);
        // call displayfriend
        Friend.displayFriends();
    }
   




}

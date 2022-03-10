public class cpobt {
    //Coppy object
    public static void main(String[] args) {
        Oto oto1 = new Oto("honda","winner",2020);
        // Oto oto2 = new Oto("yamaha", "exciter", 2021);
       // oto1 = oto2;    Oto@4617c264 ham se coppy gia tri roi inra
       //                 Oto@4617c264
        // oto2.coppy(oto1); noi chung la coppy cua thang 1
        Oto oto2 = new Oto(oto1);// tao 1 ham coppy ben class oto
        System.out.println(oto1);//Oto@4617c264   Oto@4617c264   Oto@4617c264 
        System.out.println(oto2);//Oto@36baf30c   Oto@4617c264   Oto@36baf30c
        System.out.println();
        System.out.println(oto1.getMake());
        System.out.println(oto1.getModel());
        System.out.println(oto1.getYear());
        System.out.println();
        System.out.println(oto2.getModel());
        System.out.println(oto2.getMake());        
        System.out.println(oto2.getYear());
// honda
// winner
// 2020

// exciter
// yamaha
// 2021
    }
}

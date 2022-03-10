import java.util.Random;
public class rdnb {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(6);// tu 0 -5 vi mtinh bat dau tu 0 nen muon 6 thi +1
        double z = random.nextDouble(5);//() neu ko them gia tri vao thi se random 0-1
        boolean y = random.nextBoolean();
        System.out.println(y);
    }
}

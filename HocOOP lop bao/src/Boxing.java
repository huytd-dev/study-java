import java.util.ArrayList;

public class Boxing {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();// neu ta de int se sai chuyen qua lop bao la Integer
        number.add(100);
        number.add(-20);
        number.add(Integer.valueOf("120"));
        int a = number.get(0);

        System.out.println(a);



    }
}

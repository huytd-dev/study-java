import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thread2 extends Thread{
    List<Character> list = new ArrayList<>();

    @Override
    public void run() {
        int min = 'a';
        int max = 'z';
        //chay random a -z la tu  97 den 122
        int limit = max -min;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int rad = random.nextInt(limit)+min;
            char c = (char) rad;

            list.add(c);
            System.out.println("thread 2 > "+c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

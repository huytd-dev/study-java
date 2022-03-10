import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread1 extends Thread{
    List<Integer> list = new ArrayList<>();

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rad = random.nextInt(100);//khai bao  so rad chay random den 100
            list.add(rad);
            System.out.println("thread 1 > "+ rad);// thong bao t1 dang in so rand

            try {
                Thread.sleep(500);/* cho delay 1s moi khi in */
            } catch (InterruptedException e) {
                e.printStackTrace();
//                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, e);
            }
        }
//        stop();// sau khi chay het vong lap for thi stop luong or xu li het code thi no tu chet co stop hay ko cung dc
    }


}

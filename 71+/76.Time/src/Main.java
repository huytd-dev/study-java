import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 10;
            @Override
            public void run() {
                if (counter > 0) {
                    System.out.println(counter + " seconds");
                    counter--;
                } else {
                    System.out.println("happy new year!");
                    timer.cancel();
                }
            }
        };
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2022);
        date.set(Calendar.MONTH,Calendar.MARCH);
        date.set(Calendar.DAY_OF_MONTH,1);
        date.set(Calendar.HOUR_OF_DAY,18);
        date.set(Calendar.MINUTE,22);
        date.set(Calendar.SECOND,0);
        date.set(Calendar.MILLISECOND,0);

//
//
////        timer.schedule(task,3000);
//        timer.schedule(task,date.getTime());// goi den tg thuc cua may tinh
//        timer.scheduleAtFixedRate(task,0,1000); set dem nguoc
        timer.scheduleAtFixedRate(task,date.getTime(),1000);// hoac ta co the dem nguoc duaa
        // thoi gian cua may tinh = gettime
    }
}

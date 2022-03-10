public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread1.join();// neu ko co dong nay thi 2 thread dong thoi chay,
        // con co no thi xong 1 moi den 2
        // con neu ta them delay thi het delay 2 se chay
        thread2.start();
    }
}

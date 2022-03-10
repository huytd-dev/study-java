public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(Thread.activeCount());// dem so thot dang chay tren ct:v
//        // set name cua thread dang chay
//        Thread.currentThread().setName("HuyvipprodanghocThread");
//        System.out.println(Thread.currentThread().getName());// doc ra HuyvipprodanghocThread

//        Thread.currentThread().setPriority(10);
//        System.out.println(Thread.currentThread().getPriority());// 5// co the set lai dc
//        System.out.println(Thread.currentThread().isAlive());//kt song ko :))
//        for (int i = 3; i >0; i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("Done");// dem xong la ket thuc ct :v

        MyThread thread2 = new MyThread();
        thread2.setDaemon(false);
        System.out.println(thread2.isDaemon());
        thread2.start();// tra ve true va in ra lenh ben class con
//        thread2.run();// tra ve false
//        System.out.println(thread2.isAlive());

        // doi ten cho thread2
//        thread2.setName("thot thu 2");
//        System.out.println(thread2.getName()); // Thread-0
//
//
//        System.out.println(thread2.getPriority());//5 nhung ta de dong priority o tren main chay no se in ra 1
        System.out.println(Thread.activeCount());
    }
}

public class Baitap {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println((int)'a');// ep kieu int a de biet a la 97 a den z chay tu 97 - 122
    Thread1 thread1 = new Thread1();
    Thread2 thread2 = new Thread2();

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();
    // hien thi ket qua trong luong main
        System.out.println("hien thi ket qua sinh nau ngau nhien: ");
        System.out.println("t1: ");
        for (int i = 0; i < thread1.list.size(); i++) {
            System.out.print(" "+ thread1.list.get(i));
        }
        System.out.println();

        System.out.println("t2 ");
        for (int i = 0; i < thread2.list.size(); i++) {
            System.out.print(" "+ thread2.list.get(i));
        }


    }
}

public class SharedData {
    public  int x = 0;
    public synchronized void add(int plus){// neu nhieu luong giong nhau cung lam viec thi p dong bo synchronized
        x +=plus;
        System.out.println("\nday so x : "+ x);
        for (int i = 0; i < x; i++) {
            System.out.print(" "+i);
        }
    }
}

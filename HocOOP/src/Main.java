import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long x, y ,temp, Min, Max, res =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao x: ");
        x = scanner.nextLong();
        System.out.println("nhap vao y: ");
        y = scanner.nextLong();
        Min = Math.min(x,y);
        Max = Math.max(x,y);
        for (int i = 1; i*i<=Min  ; i++) {
            if(Min % i == 0){
                temp = Min/i;
                if(Max % i == 0){
                    res++;
                }
                if (temp != i && Max % temp == 0){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}

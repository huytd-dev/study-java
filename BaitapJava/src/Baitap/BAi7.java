package Baitap;

import java.util.Scanner;

public class BAi7 {
    public static void main(String[] args) {
        int n;
        double s = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            s += (double)1/i;// ep kieu vi khai bao i la int
        }
        System.out.printf("tong = %.2f ",s);
    }
}

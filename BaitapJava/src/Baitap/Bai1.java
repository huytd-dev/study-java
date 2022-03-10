package Baitap;

import java.util.Scanner;
// ve hinh chu nhat theo chiu rong m n nhap tu ban phim.
// dung for long` for de lam
public class Bai1 {
    public static void main(String[] args) {
        int m , n;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");// neu println no se in tung dong
            }
            System.out.println();
        }
    }
}

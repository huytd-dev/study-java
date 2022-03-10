package Baitap;

import java.util.Scanner;

// ve hinh cn 5 5 nhung chi in vien ko in ruot
public class Bai2 {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == m-1 || j == n -1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

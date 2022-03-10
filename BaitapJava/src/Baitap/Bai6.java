package Baitap;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n = ");
        int n = scanner.nextInt();
        int  i;
        if(n % 2 == 0){
            i = 2;
        }else {
            i = 1;
        }
        long sum = 0;
        for (; i <= n; i+=2) {
            sum+=i;
        }
        System.out.println("ket qua: "+sum);
    }
}

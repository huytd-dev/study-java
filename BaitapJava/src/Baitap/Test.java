package Baitap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("nhap vao lan luot cac phan tu i "+(i+1)+" ");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i]>a[j]){
                        int temp =0;
                     temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }

        }
        System.out.println("max= "+a[0]);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]+" ");
        }

    }
}
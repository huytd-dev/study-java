package Baitap;

import java.util.Random;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        int count = 0;
        Random random = new Random();

        while (true){
            int ranNumber = random.nextInt(100);
            count++;
            System.out.println("random number "+ranNumber+" input"+ input);
            if (ranNumber == input){
                System.out.println("thu hien "+ count+" lan");
                break;
            }
        }
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("src/Secret.txt");

        if (file.exists()) {
            System.out.println("that file exists! ");
        } else {
            System.out.println("that file doesn't exists! ");

        }

    }

}

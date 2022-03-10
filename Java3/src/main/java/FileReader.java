import java.io.File;

public class FileReader {
    public static void main(String[] args) {
        File file = new File("src/main/resources/Huyhuy.txt");

        if (file.exists()) {
            System.out.println("that file exists! ");
        } else {
            System.out.println("that file doesn't exists! ");

        }

    }

}




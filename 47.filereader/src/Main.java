
package src;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            FileReader reader = new FileReader("D:\\java\\47.filereader\\src\\art.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

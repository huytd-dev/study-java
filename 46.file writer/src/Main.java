import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("src/writer.txt");
            writer.write("proooooooooooo");
            writer.append("\n(Mot bai tho xam lol!)");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}

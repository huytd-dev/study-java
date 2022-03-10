import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("D:\\java\\48.audio\\src\\Till I Let Go.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        String response = "";
        while (!response.equals("Q")){
            System.out.println("p = play, s = stop, r = reset, q = quit");
            System.out.print("enter your choice ");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response){
                case ("P"): clip.start();
                break;
                case ("S"): clip.stop();
                break;
                case ("R"): clip.setMicrosecondPosition(0);
                break;
                case ("Q"): clip.close();
                break;
                default:System.out.println("not a valid response");
            }
        }
        System.out.println("byeeeee!");

    }
}

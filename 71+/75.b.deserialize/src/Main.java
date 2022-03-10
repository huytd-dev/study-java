import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
//deseialize la doc 1 file ma hoa boi seialization
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;

        FileInputStream filein = new FileInputStream("D:\\java\\71+\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(filein);
        user = (User) in.readObject();
        in.close();
        filein.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}

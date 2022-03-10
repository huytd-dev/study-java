import java.io.*;
//seialization la ma hoa 1 file
public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();

        user.name = "Huyvip";
        user.password = "Viginia123!";

//        user.sayHello();

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info save!");

    }
}

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("0001","Tran Duc Huy","dak lak",29, 9.5f));
        students.add(new Student("0002","Tran Duc Hoa","dak nong",28, 9.85f));
        students.add(new Student("0003","Tran Duc Hung","da lat",29, 9.7f));
        students.add(new Student("0004","Tran Duc Hau","da nang",27, 8.5f));
        students.add(new Student("0005","Tran Duc Hai","han cuoc",26, 9.6f));
        students.add(new Student("0006","Tran Duc Hoang","dak lak",32, 8.4f));

        Collections.sort(students);
        showInfo(students);
    }


    public static void showInfo(ArrayList<Student>list){
        for (Student student : list){
            System.out.println(student);
        }
    }
}

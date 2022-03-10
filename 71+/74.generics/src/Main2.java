import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        MyGenericClass<Integer> myInt = new MyGenericClass(1);
        MyGenericClass<Character> myChar = new MyGenericClass('@');
        MyGenericClass<Double> myDouble = new MyGenericClass(3.15);
        MyGenericClass<String> myString = new MyGenericClass("hello");

        ArrayList<String> myFriends = new ArrayList<>();

        System.out.println(myInt.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myString.getValue());
    }
}

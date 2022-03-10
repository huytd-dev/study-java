public class arrayofobject {
    public static void main(String[] args) {
        // int[] number = new int[3];
        // char[] characters = new char[4];
        // String[] strings = new String[5];
        // Food[] refrigerator = new Food[3];  
        Food food1 = new Food("mia");
        Food food2 = new Food("rick");
        Food food3 = new Food("cozay");
        Food[] refrigerator = {food1, food2, food3}; //them dong nay thi ko can 3 dong duoi

        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}

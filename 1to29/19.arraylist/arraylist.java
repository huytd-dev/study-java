import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("bread");
        food.add("meat");
        food.add("hotdog");
        food.set(3, "tomato");// ko the set cho 4
        food.remove(2);
        food.clear();// ko tra ve gi ca
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}

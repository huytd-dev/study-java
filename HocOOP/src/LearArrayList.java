import java.util.ArrayList;

public class LearArrayList {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();// chi chua cac phan tu cua animal
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        Animal a = animals.get(0);//lay 1 phan tu trong animal
        animals.remove(3);// xoa phan tu thu 3 sau khi in se con 5
        animals.clear();// xoa het tat cac cac phan tu
        System.out.println("size of arraylist = "+animals.size());// in size of array
    }
}

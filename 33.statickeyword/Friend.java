public class Friend {
    String name;
    static int numberoffriend;
    Friend(String name){
        this.name = name;
        numberoffriend++;
    }
    static void displayFriends(){
        System.out.println("you have "+numberoffriend+" firend");
    }
}

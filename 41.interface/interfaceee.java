public class interfaceee {
    public static void main(String[] args) {
        Thor thor = new Thor();
        thor.flee();
        Hawk hawk = new Hawk();
        hawk.Hunt(); // ko dung dc hawk.flee vi trong class hawk ko co
        Fish fish = new Fish();
        fish.flee();
        fish.Hunt();
    }
}

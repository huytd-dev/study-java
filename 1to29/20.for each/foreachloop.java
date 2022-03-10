public class foreachloop {
    public static void main(String[] args) {
        // String[] animals = {"meo", "cho", "ga"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("meo");
        animals.add("cho");
        animals.add("ga");
        animals.add("nai");
        animals.add("bau");
        for(String i : animals){
            System.out.println(i);
        }
    }
}

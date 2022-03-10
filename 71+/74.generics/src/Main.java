public class Main {
    public static void main(String[] args) {
        Integer [] intArray = {1,2,3,4,5};
        Double[] doubleArray = {5.5,6.6,7.7,8.8};
        Character[] charArray = {'h','Y','z','g'};
        String[] stringArray = {"B", "Y", "E"};

//        displayArray(intArray);
//        displayArray(doubleArray);
//        displayArray(charArray);
//        displayArray(stringArray);

        System.out.println(get1st(intArray));
        System.out.println(get1st(doubleArray));
        System.out.println(get1st(charArray));
        System.out.println(get1st(stringArray));



    }
//    public static void displayArray(Integer[] array){
        public static <Thing> void displayArray(Thing[] array){
        for (Thing x : array){
            System.out.print(x+"          ");
        }
        System.out.println();
    }

    public static <Thing> Thing get1st(Thing[] array){

        return array[0];
    }
//    public static void displayArray(Double[] array){
//        for (Double x : array){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//    }
//    public static void displayArray(Character[] array){
//        for (Character x : array){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//    }
//    public static void displayArray(String[] array){
//        for (String x : array){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//    }
}

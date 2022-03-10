public class array2 {
    public static void main(String[] args) {
        // String[] cars = {"honda", "tesla", "lexsus"};
        // cars [0] = "yamaha";// cap nhap car[0];
        // System.out.println(cars[0]);

        String[] cars = new String[3];
        cars[0] = "honda";
        cars[1] = "yamaha";
        cars[2] = "suziky";
        for (int i = 0; i < cars.length; i++) {//cars.lenth = 3
            System.out.println(cars[i]);
            
        }


    }
}

public class array2d {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];
        cars[0][0] = "ased";
        cars[0][1] = "prozz";
        cars[0][2] = "z200";
        cars[1][0] = "winner";
        cars[1][1] = "untubu";
        cars[1][2] = "hayabusa";
        cars[1][2] = "hayabusa";

        cars[2][0] = "zeus";
        cars[2][1] = "pristil";
        cars[2][2] = "roller";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
        }

    


    }
    
}
}

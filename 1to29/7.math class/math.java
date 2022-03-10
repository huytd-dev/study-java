

import java.util.Scanner;


public class math {

    public static void main(String[] args) {
        // double  y = 3.14;
        // double x = -10;
        // double z = Math.max(x, y);
        // double b = Math.min(x, y);//abs pow // sqrt
        // double g = Math.floor(y);
        // System.out.println(z);
        // System.out.println(g);

        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x :");
        x = scanner.nextDouble();
        System.out.println("enter y :");
        y = scanner.nextDouble();
        z = Math.sqrt((x*x)+(y*y));
        System.out.println("z = "+z);
        scanner.close();



        

    }
    
}

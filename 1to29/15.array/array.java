import java.util.Scanner;
public class array {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int rows;
            int cols;
            String symbol = "";
            System.out.println("enter the row: ");
            rows = scanner.nextInt();
            System.out.println("enter the cols: ");
            cols = scanner.nextInt();
            System.out.println("enter the symbol: ");
            symbol = scanner.next();

            for(int i = 0; i < rows ; i++){
                System.out.println();
                for(int j = 0;j < cols; j++){
                    System.out.print(symbol);
                }
            }
    }
}


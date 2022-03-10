import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {


            System.out.println("enter a whole number to divide: ");
            double x = scanner.nextDouble();
            System.out.println("enter a whole number to divide by: ");
            double y = scanner.nextDouble();
            double z = x / y; // 5/2 neu de int se ra 2 nen phai dua ve float or double
            System.out.println(z);
        }
        // exception la 1 ct khi nhap input sai se dung ct, de tiep tuc chay ta dung 1 so
        // ham ngoai le de tiep tuc ct . bao ham code chinh trong Try{}
        // dung cath() de couter lai exception neu co
        // da so exception se xuat hien khi ta lam sai chuong trinh
        catch (InputMismatchException e){// neu nhap so thi ct se sai nen ta them InputMismatchException
            System.out.println("plz! enter a number!");
        }
        catch (Exception e){
            System.out.println("Some thing wrong!");
        }
        finally {
            scanner.close();
        }
    }
}

import java.util.Scanner;
public class logical {
public static void main(String[] args) {
    //&& thoa ca 2
    // || hoac
    // != phu dinh 
    //     int temp =35;
    //     if(temp >30){
    //         System.out.println("it hot!");
    //     }else if(temp >=20 && temp<=30){
    //         System.out.println("if warm");
    //     }else{
    //         System.out.println("if cold");
    //     } 
    // }
    Scanner scanner = new Scanner(System.in);
    System.out.println("ban dang choi game! nhan Q or q de thoat \n");
    String response = scanner.next();

    //     if(response.equals("q") || response.equals("Q")){
    //         System.out.println("you quit the game");
    //     }else{
    //         System.out.println("you are still playing the game!");
    //     }
    // }
                if(!response.equals("q") && !response.equals("Q")){
                    System.out.println("you are still playing the game!");
            
                 }else{
                    System.out.println("you quit the game");
        }
    }
}

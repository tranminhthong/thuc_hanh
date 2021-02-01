import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        boolean flag = false;
        do {
            try {
                System.out.println("Nhập số");
                sc.nextInt();
                flag = true;
            }catch (InputMismatchException e){
                System.out.println("lỗi");
                sc.nextLine();
            }
        }while (!flag);
    }
}

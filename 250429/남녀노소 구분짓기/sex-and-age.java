import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == 0) {
            if (num2 >= 19) {
                System.out.println("MAN");
            }
            else {
                System.out.println("BOY");
            }

        }
        else if (num1 == 1) {
            if (num2 >= 19) {
                System.out.println("WOMAN");
            }
            else {
                System.out.println("GIRL");
            }
        }
    }
}

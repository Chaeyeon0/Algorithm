import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.print(N*(i+1)+ " ");
        }
    }
}


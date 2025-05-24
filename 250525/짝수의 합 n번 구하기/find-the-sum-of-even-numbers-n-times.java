import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  

        for (int t = 0; t < N; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;

            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            // 친근하지 않은 수면 count 증가
            count++;
        }

        System.out.println(count);
    }
}

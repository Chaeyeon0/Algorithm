import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        //배열로 저장해서 풀어보자
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = N-1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
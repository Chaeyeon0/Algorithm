import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[4][4];
        int total = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        //계단형식
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                total += array[i][j];
            }
        }
        System.out.println(total);
    }
}

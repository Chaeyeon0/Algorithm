import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[4][4];

        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 4; j++) {
                array[i][j] = sc.nextInt();
                total += array[i][j];
            }
            System.out.println(total);
        }
    }
}

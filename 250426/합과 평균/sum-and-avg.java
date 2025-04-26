import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = A+B;
        double C = (double) sum/2;

        System.out.printf("%d %.1f",sum, C);
    }
}


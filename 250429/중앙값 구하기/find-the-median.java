import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int mid;

        if ((A >= B && A <= C) || (A <= B && A >= C)) {
            mid = A;
        } else if ((B >= A && B <= C) || (B <= A && B >= C)) {
            mid = B;
        }else{
            mid = C;
        }

        System.out.println(mid);
    }
}

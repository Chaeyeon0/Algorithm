import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();

        while (true) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            inputs.add(a);
        }

        for (int i = 0; i < inputs.size(); i++) {
            System.out.println(inputs.get(i)); 
        }
    }
}

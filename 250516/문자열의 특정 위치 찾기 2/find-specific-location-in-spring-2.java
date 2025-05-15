import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);

        String[] words = {"apple", "banana", "grape", "blueberry", "orange"};
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if ((word.length() >= 3 && word.charAt(2) == ch) ||
                    (word.length() >= 4 && word.charAt(3) == ch)) {
                System.out.println(word);
                count++;
            }
        }
        System.out.println(count);
    }
}

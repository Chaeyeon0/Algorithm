import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] arr = text.toCharArray();

        if(text.length()>=2){
            arr[1]='a';
            arr[text.length()-2]='a';
        }

        String result = new String(arr);
        System.out.println(result);
    }
}

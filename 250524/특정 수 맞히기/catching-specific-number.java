import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer= 25;
        int n;

        while(true){
            n=sc.nextInt();
            if(n < answer){
                System.out.println("Higher");
            }
            else if(n > answer){
                System.out.println("Lower");
            }
            else{
                System.out.println("Good");
                break;
            }
        }
    }
}

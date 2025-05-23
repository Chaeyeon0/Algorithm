import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int current = A;
        while(current<=B){
            System.out.print(current + " ");
            if(current %2 ==1){
                current*=2;
            }
            else{
                current+=3;
            }
        }
        
    }

}

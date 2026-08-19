import java.util.Scanner;

public class Sosu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = num - 1; i >= 2; i--){
            if (num % i == 0){
                isPrime = false;

                break;
            }

        }
        System.out.print(isPrime ? "소수입니다." : "정수입니다.");
    }
}

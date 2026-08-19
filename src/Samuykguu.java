import java.util.Scanner;
public class Samuykguu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int j = i % 3;
            if (j == 3 || j == 6 || j == 9) {
                System.out.print("X ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
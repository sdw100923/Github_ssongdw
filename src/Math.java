import java.util.Scanner;
public class Math {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A == B) {
            System.out.print("같습니다");
        } else if (A < B) {
            System.out.print(B);

        } else if (B < A) {
            System.out.print(A);

        }
    }
}

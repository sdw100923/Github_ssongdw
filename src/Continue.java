import java.util.Scanner;
public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {


            if (i % 3 == 0) {
                continue;
            }


            System.out.print(i + " ");
        }
        }
    }


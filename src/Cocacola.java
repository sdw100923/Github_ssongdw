import java.util.Scanner;

public class Cocacola {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        while(true){
            System.out.print(N + " ");
            if(N == 1)break;

            if (N % 2 == 0){
                N = N / 2;
            } else  {
                N = N * 3 + 1;

            }
            count++;

        }
        System.out.println("\n" + count + "번 에 시도 끝에 1에 도달했습니다");
    }
}

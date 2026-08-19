import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
        if (i %3 ==0 && i% 5 ==0){
            System.out.print("fizzbuzz" + " ");
        }else if (i % 3 == 0) {
                System.out.print("fizz" + " ");
            } else if (i % 5 ==0) {
                System.out.print("buzz" + " ");
            }else{
                System.out.print(i + " ");
            }
        }
    }
}
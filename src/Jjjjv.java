import java.util.Scanner;
public class Jjjjv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int randomNumber = 41;
        System.out.println("랜덤 넘버" + randomNumber);
        int count = 0;

        while (true) {
            System.out.println("숫자를 입력하세요. (시도횟수 :" + count + "):");
            int guess = sc.nextInt();
            if(guess == randomNumber){
                System.out.println("정답입니다!" + count + "번에 맞춤.");
                break;
            }
        }



    }
}

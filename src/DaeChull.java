import java.util.Scanner;

public class DaeChull {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하시오 : ");
        int na2 = sc.nextInt();
        System.out.println("연소득을 입력하십시오 (만원): ");
        int soduk = sc.nextInt();
        System.out.println("신용점수를 입력하십시오 : ");
        int shindragon = sc.nextInt();
        if (na2 < 20 || shindragon < 600){
            System.out.println("대출 불가");
        } else if (shindragon > 800 || soduk > 5000 || na2 > 20) {
            System.out.println("대출 한도는 1억 입니다.");
            
        } else if (shindragon > 800 || soduk < 5000 || na2 > 20) {
            System.out.println("대출 한도는 5000만원 입니다.");

        } else if (shindragon < 800 || soduk < 5000 || na2 > 20) {
            System.out.println("대출 한도는 2000만원 입니다.");
        }
    }
}


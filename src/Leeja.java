import java.util.Scanner;

public class Leeja {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("원금을 입력하시오 : ");
        int wongold = sc.nextInt();
        System.out.println("연이율을 입력하시오 : ");
        double yearleeyul = sc.nextInt();
        System.out.println("기간을 입력하시오 : ");
        int year = sc.nextInt();
        System.out.println("이자 : " + (wongold * yearleeyul * year));
        System.out.println("최종금액 : " + (wongold * yearleeyul * year + yearleeyul));

    }
}

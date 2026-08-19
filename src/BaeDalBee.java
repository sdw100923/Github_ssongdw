import java.util.Scanner;

public class BaeDalBee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("주문금액 : ");
        int jumungoldak = sc.nextInt();
        if (jumungoldak < 15000){
            System.out.println("배달비는 " + 3000 + "원입니다");
            System.out.println("최종금액 : ");
            System.out.println(jumungoldak + 3000);
        } else if (jumungoldak < 30000) {
            System.out.println("배달비는 " + 1000 + "원입니다");
            System.out.println("최종금액 : ");
            System.out.println(jumungoldak + 1000);

        }else{
            System.out.println("최종금액 : ");
            System.out.println(jumungoldak);
        }

    }
}
